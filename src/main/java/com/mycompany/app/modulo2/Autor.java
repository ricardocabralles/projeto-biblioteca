package com.mycompany.app;

public class Autor extends Pessoa {
    private String nacionalidade;
    private boolean ehUsuario; // Campo solicitado no desafio 1 da imagem 893400

    public Autor(String nome, String nacionalidade, boolean ehUsuario) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.ehUsuario = ehUsuario;
    }

    public String getNacionalidade() { return nacionalidade; }
    public boolean isEhUsuario() { return ehUsuario; }
}