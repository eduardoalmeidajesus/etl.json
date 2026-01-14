package br.edu.utfpr.td.tsi.raspador.atividade3.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orientacoes")
public class OrientacaoTCC {
    @Id
    private String id;
    
    private Aluno aluno;
    private Trabalho trabalho;
    private String dataDefesa;
    
    public OrientacaoTCC() {
        super();
    }
    
    public OrientacaoTCC(Aluno aluno, Trabalho trabalho, String dataDefesa) {
        super();
        this.aluno = aluno;
        this.trabalho = trabalho;
        this.dataDefesa = dataDefesa;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public Trabalho getTrabalho() {
        return trabalho;
    }
    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }
    public String getDataDefesa() {
        return dataDefesa;
    }
    public void setDataDefesa(String dataDefesa) {
        this.dataDefesa = dataDefesa;
    }
}