package com.mycompany.app;

public class EstrategiaPublicacaoLivro implements PublicavelInterface {
    @Override
    public void publicar() {
        System.out.println("Publicando livro: Validando ISBN e enviando para a editora.");
    }
}