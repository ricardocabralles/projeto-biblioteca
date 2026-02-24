package com.mycompany.app;

public class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, String genero, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = disponivel;
    }

    public String getTitulo() { return titulo; }
    public Autor getAutor() { return autor; }
    public String getGenero() { return genero; }
    public boolean eDisponivel() { return disponivel; }
    
    public void mudarDisponibilidade() {
        this.disponivel = !this.disponivel;
    }
}