package com.mycompany.app;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArtigoTest {
    @Test
    public void testAtributosArtigo() {
        Autor autor = new Autor("Autor Teste", "Brasileira", false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
        
        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertTrue(artigo.isPublicado());
    }
}