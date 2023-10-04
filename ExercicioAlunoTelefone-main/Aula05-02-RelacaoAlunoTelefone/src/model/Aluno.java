package model;

import java.util.List;

public class Aluno {
    private int idAluno;
    private String nome;
    private int idade;
    private List<AlunoTelefone> telefones;

    // Construtor
    public Aluno(int idAluno, String nome, int idade) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public List<AlunoTelefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<AlunoTelefone> telefones) {
        this.telefones = telefones;
    }

    // Método toString para exibir informações do aluno
    @Override
    public String toString() {
        return "ID Aluno: " + idAluno + ", Nome: " + nome + ", Idade: " + idade;
    }
}