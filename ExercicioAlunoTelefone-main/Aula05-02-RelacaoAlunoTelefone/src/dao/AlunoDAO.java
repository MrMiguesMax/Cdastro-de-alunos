package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Aluno;
import model.AlunoTelefone;

public class AlunoDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/seubanco";
    private static final String USUARIO = "root";
    private static final String SENHA = "aluno";
    private Connection connection;

    public AlunoDAO() {
        
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
    public void fechaConexao() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                // Lida com erros de fechamento da conexão
                e.printStackTrace();
            }
        }
    }

    public void adicionaAluno(Aluno aluno) {
    	
		try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
			String sql = "INSERT INTO tarefa (id_aluno, nome, idade) VALUES (?,?,?);";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, obtemMaiorid_aluno());
			
			preparedStatement.setString(2, aluno.getNome() + " - Tarefa " + obtemMaiorid_aluno());
			
			preparedStatement.setInt(3, aluno.getIdade());

			preparedStatement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
    
    public void excluiAluno(int id_aluno) {

		try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {

			String sql = "DELETE FROM aluno WHERE id_aluno = ?;";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id_aluno);

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	public int obtemMaiorIdAluno() {
	
		int id_aluno = 0;

	
		try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {

			String sql = "SELECT MAX(id_aluno) as id_aluno FROM aluno;";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				
				id_aluno = resultSet.getInt("id_tarefa");
			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return ++id_aluno;
	}


    public Aluno buscarAlunoPorId(int id) throws SQLException {
        
        return null; 
    }

    // Método para atualizar os dados de um aluno no banco de dados
    public boolean atualizarAluno(Aluno aluno) throws SQLException {
        
        return false;
    }

    // Método para excluir um aluno pelo ID (id_aluno) no banco de dados
    public boolean excluirAluno(int id) throws SQLException {
 
        return false;
    }

    // Método para listar todos os alunos no banco de dados
    public List<Aluno> listarAlunos() throws SQLException {
        List<Aluno> alunos = new ArrayList<>();
        
        return alunos;
    }
}
