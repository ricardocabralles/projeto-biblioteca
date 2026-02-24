package com.mycompany.app;

public class Main {
    public static void main(String[] args) {
        
        Autor autor = new Autor("Jessica Felix", "Brasileira", false);
        
       
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia", true);
        
        
        Usuario usuario = new Usuario("Lucas Rafael", 25);

       
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        
        System.out.println("--- Sistema da Biblioteca ---");
        System.out.println("Artigo Adicionado: " + artigo.getTitulo());
        System.out.println("Autor do Artigo: " + autor.getNome());
        System.out.println("É usuário? " + (autor.isEhUsuario() ? "Sim" : "Não"));
        System.out.println("-----------------------------");

     
        livro.mudarDisponibilidade(); 

        if (!livro.eDisponivel()) {
            System.out.println("O livro não está disponível no momento.");
            
            
            Emprestimo emp = new Emprestimo(livro, usuario);
            emp.imprimirResumo();
        }
    }
}