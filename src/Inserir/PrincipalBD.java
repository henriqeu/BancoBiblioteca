package Inserir;

import java.util.Random;
import java.sql.SQLException;

public class PrincipalBD {

        public static void main(String[] args) throws SQLException {
        // Criação da Classe BancoDados
        BancoDados bd = new BancoDados();

        // Endereço para conexão ao BD
        String urlBD = "jdbc:mysql://localhost:3306/biblioteca?user=root&password=";

        // Driver utilizado para acesso ao BD
        String driver = "com.mysql.cj.jdbc.Driver";

        // Conexão ao BD
        System.out.println(bd.conectar(urlBD, driver));

        // Autor // INSERT INTO `autor` (`id`, `nome`, `nacionalidade`) VALUES (1, 'Luan', 'Brasileiro');
        int idAutor = 10;
        String nome = "Luan";
        String nacionalidade = "Brasileiro";
                String sqlAutor = "INSERT INTO autor (id, nome, nacionalidade) values ('"
                                + idAutor + "','"
                                + nome + "','"
                                + nacionalidade
                                + "')";

        // Editora: // INSERT INTO `editora` (`id`, `nome`) VALUES ('1', 'Editora');
        int idEditora = 1;
        String nomeEditora = "Leticia";
                String sqlEditora = "INSERT INTO editora (id, nome) values ('" + idEditora + "','" + nomeEditora + "')";

        // Categoria INSERT INTO `categoria` (`id`, `tipo_categoria`) VALUES (NULL, 'Terror');
        int idCategoria = 10;
        String tipo_categoria = "Terror";
                String sqlCategoria = "INSERT INTO Categoria (id, tipo_categoria) values ('" + idCategoria + "','"
                                + tipo_categoria
                                + "')";

        // Livro INSERT INTO `livro` (`ISBN`, `titulo`, `ano`, `fk_editora`, `fk_categoria`)
        // VALUES ('1', 'Senhor Dos Aneis', '2022', '1', '1');
        int isbn = 1;
        String titulo = "Senhor Dos Aneis";
        int ano = 2022;
                String sqlLivro = "INSERT INTO livro (isbn, titulo, ano, fk_editora, fk_categoria) values ('"
                                + isbn + "','"
                                + titulo + "','"
                                + ano + "','"
                                + idEditora + "','"
                                + idCategoria
                                + "')";

        // Livro Autor INSERT INTO `livroautor` (`int`, `fk_autor`, `fk_livro`) VALUES
        // (NULL, '1', '1');
                String sqlLivroAutor = "INSERT INTO livroautor (fk_autor, fk_livro) values ('"
                                + idAutor + "','"
                                + isbn
                                + "')";

        System.out.println(bd.inserirAlterarExcluir(sqlAutor));

        System.out.println(bd.inserirAlterarExcluir(sqlEditora));

        System.out.println(bd.inserirAlterarExcluir(sqlCategoria));

        System.out.println(bd.inserirAlterarExcluir(sqlLivro));

        System.out.println(bd.inserirAlterarExcluir(sqlLivroAutor));
        }
}