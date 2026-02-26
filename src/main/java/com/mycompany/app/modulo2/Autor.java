package com.mycompany.app;

public class Autor extends Pessoa {
    private boolean ehUsuario;
    
    private PublicavelInterface estrategiaPublicacao;

    public Autor(String nome, String nacionalidade, boolean ehUsuario) {
        super(nome, nacionalidade);
        this.ehUsuario = ehUsuario;
    }

    
    public void setEstrategiaPublicacao(PublicavelInterface estrategia) {
        this.estrategiaPublicacao = estrategia;
    }

  
    public void publicar() {
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar();
        } else {
            System.out.println("Nenhuma estratégia de publicação definida para " + getNome());
        }
    }

    public boolean isEhUsuario() { return ehUsuario; }
}