import java.sql.ResultSet;
import java.sql.SQLException;

import Consultar.BancoDados;

public class PrincipalBD {

    public static void main(String[] args) throws SQLException {
        // Criação da Classe BancoDados
        BancoDados bd = new BancoDados();

        // Endereço para conexão ao BD
        String urlBD = "jdbc:mysql://localhost:3306/biblioteca?user=root&password=";

        // Driver utilizado para acesso ao BD
        String driver = "com.mysql.cj.jdbc.Driver";

        // ResultSet "Tabela" com os valores retornados da Busca
        ResultSet resultado = null;

        // Conexão ao BD
        System.out.println(bd.conectar(urlBD, driver));
        resultado = bd.consultar("select * from users");

        if (resultado != null)
            while (resultado.next()) {
                System.out
                        .println("id: " + resultado.getString("nome") + "\t senha: " + resultado.getString("senha"));
            }

        // Verifica se o resultado retornada da pesquisa junto ao BD não é vazio, senão
        // for exibe no console

    }

}
