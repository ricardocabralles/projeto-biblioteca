package com.mycompany.app;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AutorTest {
    @Test
    public void testAtributosAutor() {
        Autor autor = new Autor("Jess", "Brasileira", false);
        assertEquals("Jess", autor.getNome());
        assertFalse(autor.isEhUsuario());
    }
}