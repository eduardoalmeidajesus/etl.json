package br.edu.utfpr.td.tsi.raspador.atividade3.modelos;

public class Trabalho {
    private String titulo;
    private String nivel;
    
    public Trabalho() {
        super();
    }
    
    public Trabalho(String titulo, String nivel) {
        super();
        this.titulo = titulo;
        this.nivel = nivel;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}