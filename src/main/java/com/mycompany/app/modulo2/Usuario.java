package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
    private int idade;
    private List<Emprestimo> historicoEmprestimos = new ArrayList<>();

    public Usuario(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }

    public int getIdade() { return idade; }
    public void adicionarEmprestimo(Emprestimo e) { this.historicoEmprestimos.add(e); }
    public Emprestimo[] getHistoricoEmprestimo() {
        return historicoEmprestimos.toArray(new Emprestimo[0]);
    }
}