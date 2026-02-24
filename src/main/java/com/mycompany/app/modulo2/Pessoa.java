package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private List<Livro> livros = new ArrayList<>();

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public List<Livro> getLivros() { return livros; }
    public void setLivros(List<Livro> livros) { this.livros = livros; }
}