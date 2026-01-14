package br.edu.utfpr.td.tsi.raspador.atividade3.modelos;

public class Aluno {
    private String nome;
    private String curso;
    private String email;
    
    public Aluno() {
        super();
    }
    
    public Aluno(String nome, String curso, String email) {
        super();
        this.nome = nome;
        this.curso = curso;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}