package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.AlunoTelefone;

public class AlunoTelefoneDAO {
	private static final String URL = "jdbc:mysql://localhost:3306/seubanco";
    private static final String USUARIO = "root";
    private static final String SENHA = "aluno";
    private Connection connection;

    public AlunoTelefoneDAO(Connection connection) {
        this.connection = connection;
    }

    // Método para abrir uma conexão com o banco de dados
    public void abreConexao() throws SQLException {
    	try {
            // Carrega o driver JDBC específico (substitua pelo driver do seu banco de dados)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelece a conexão com o banco de dados usando os atributos URL, USUARIO e SENHA
            connection = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException e) {
            // Lida com erros de carregamento do driver ou conexão
            throw new SQLException("Erro ao abrir a conexão com o banco de dados", e);
        }
    }

    // Método para fechar a conexão com o banco de dados
    public void fechaConexao() throws SQLException {
    	if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                // Lida com erros de fechamento da conexão
                e.printStackTrace();
            }
        }
    }

    // Método para inserir um telefone associado a um aluno
    public void insereTelefone(AlunoTelefone alunoTelefone) throws SQLException {
        
    }

    // Método para buscar todos os telefones de um aluno por seu ID
    public List<AlunoTelefone> buscaTelefonesPorAluno(int idAluno) throws SQLException {
    	List<AlunoTelefone> telefones = new ArrayList<>();
    	
    	return telefones;
    }

    // Método para atualizar os telefones de um aluno
    public void atualizaTelefones(int idAluno, List<String> novosTelefones) throws SQLException {
        
    }

    // Método para excluir os telefones de um aluno
    public void excluiTelefones(int idAluno) throws SQLException {
        
    }

    // Outros métodos conforme necessário para sua aplicação
}

