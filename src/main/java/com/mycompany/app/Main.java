package com.mycompany.app;

public class Main {
    public static void main(String[] args) {
        // Criando os objetos...
        Autor autor = new Autor("Jessica Felix", "Brasileira");
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");
        Usuario usuario = new Usuario("Lucas Rafael", 25);

        // Simulando que o livro já foi emprestado para mostrar a mensagem
        livro.mudarDisponibilidade(); 

        if (!livro.eDisponivel()) {
            System.out.println("O livro não está disponível");
            
            // Criamos o objeto de empréstimo para gerar os dados
            Emprestimo emp = new Emprestimo(livro, usuario);
            emp.imprimirResumo();
        }
    }
}