package model;

public class AlunoTelefone {
    private int idTelefone;
    private Aluno aluno;
    private String telefone;

    // Construtor
    public AlunoTelefone(int idTelefone, Aluno aluno, String telefone) {
        this.idTelefone = idTelefone;
        this.aluno = aluno;
        this.telefone = telefone;
    }

    // Getters e Setters
    public int getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(int idTelefone) {
        this.idTelefone = idTelefone;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método toString para exibir informações do aluno-telefone
    @Override
    public String toString() {
        return "ID Telefone: " + idTelefone + ", Aluno: " + aluno.getNome() + ", Telefone: " + telefone;
    }
}

