package com.mycompany.app;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
    @Test
    public void testAtributosUsuario() {
        Usuario usuario = new Usuario("Gabriel", 21);
        assertEquals("Gabriel", usuario.getNome());
        assertEquals(21, usuario.getIdade());
    }
}