# ExercicioAlunoTelefone


Crie um aplicativo em Java, utilizando os padrões MVC, DAO e conector JDBC com banco de dados MySQL para implementar as tabelas a seguir: 
CREATE SCHEMA banco_aluno;


CREATE TABLE aluno (
  id_aluno int NOT NULL,
  nome varchar(255) DEFAULT NULL,
  idade int DEFAULT NULL,
  PRIMARY KEY (id_aluno)
);

CREATE TABLE aluno_telefone (
  id_telefone int NOT NULL PRIMARY KEY ,
  id_aluno int DEFAULT NULL,
  telefone varchar(15) DEFAULT NULL,
 CONSTRAINT fk_aluno_telefone FOREIGN KEY (id_aluno) REFERENCES aluno (id_aluno)
);


Implemente os métodos e classes que estão faltando no projeto
método adicionaAluno
método adicionaTelefone
método listaAlunos
método exibeAluno
método atualizaAluno
método excluiAluno
