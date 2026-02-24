package com.mycompany.app;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LivroTest {
    @Test
    public void testAtributosLivro() {
        Autor autor = new Autor("Jess", "Brasileira", false);
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        assertEquals("Java Basico", livro1.getTitulo());
        assertTrue(livro1.eDisponivel());
        assertFalse(livro2.eDisponivel());
    }
}