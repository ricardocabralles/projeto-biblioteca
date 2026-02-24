package com.mycompany.app;

import java.util.Date;

public class Emprestimo {
    private Date dataRetirada = new Date();
    private Date dataDevolucao = new Date();
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
    }

    public Livro getLivro() { return livro; }
    public Usuario getUsuario() { return usuario; }
    public Date getDataRetirada() { return dataRetirada; }
}