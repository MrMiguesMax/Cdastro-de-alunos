package view;

import java.util.List;

import model.Aluno;
import model.AlunoTelefone;

import java.util.List;

public class AlunoView {
    
    // Método para exibir os detalhes de um aluno, incluindo seus telefones
    public void exibeAluno(Aluno aluno) {
        if (aluno != null) {
            System.out.println("Detalhes do Aluno:");
            System.out.println("ID: " + aluno.getIdAluno());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            
            List<AlunoTelefone> telefones = aluno.getTelefones();
            if (telefones != null && !telefones.isEmpty()) {
                System.out.println("Telefones:");
                for (AlunoTelefone telefone : telefones) {
                    System.out.println("   - " + telefone.getTelefone());
                }
            } else {
                System.out.println("O aluno não possui telefones cadastrados.");
            }
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
    
    // Método para listar os alunos com ID, Nome e Idade
    public void listaAlunos(List<Aluno> alunos) {
        if (alunos != null && !alunos.isEmpty()) {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : alunos) {
                System.out.println("ID: " + aluno.getIdAluno() + ", Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
            }
        } else {
            System.out.println("Nenhum aluno cadastrado.");
        }
    }
}
