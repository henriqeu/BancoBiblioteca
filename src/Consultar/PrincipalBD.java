package Consultar;

import java.sql.ResultSet;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrincipalBD {

    public static void main(String[] args) throws SQLException {
        // Crirar classe banco d
        BancoDados bd = new BancoDados();

        // String de conexão do banco "users=banco de dados / usuário = root /"
        String urlBD = "jdbc:mysql://localhost:3306/biblioteca?user=root&password=";

        // Driver utilizado para acesso ao BD
        String driver = "com.mysql.cj.jdbc.Driver";

        // ResultSet da tabela com os valores retornados da Busca
        ResultSet resultado = null;

        // Conexão ao BD
        System.out.println(bd.conectar(urlBD, driver));
        resultado = bd.consultar(
                "SELECT ISBN, titulo, ano, fk_editora, nome, nacionalidade, tipo_categoria from livro, categoria, autor");

        // Verifica se o resultado retornada da pesquisa junto ao BD não é vazio, senão
        // for exibe no console
        if (resultado != null)
            while (resultado.next()) {
                System.out
                        .println("ISBN: " + resultado.getString("ISBN") +
                                "\tTitulo: " + resultado.getString("titulo") +
                                "\tAno: " + resultado.getString("ano") +
                                "\tEditora: " + resultado.getString("fk_editora") +
                                "\tNome: " + resultado.getString("nome") +
                                "\tNacionalidade: " + resultado.getString("nacionalidade") +
                                " Categoria: " + resultado.getString("tipo_categoria"));
            }

    }

}