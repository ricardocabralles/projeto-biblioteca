package com.mycompany.app;

public class EstrategiaPublicacaoArtigo implements PublicavelInterface {
    @Override
    public void publicar() {
        System.out.println("Publicando artigo: Revisando citações e submetendo à revista científica.");
    }
}