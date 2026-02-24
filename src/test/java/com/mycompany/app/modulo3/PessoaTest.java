package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class PessoaTest {
    @Test
    public void testAtributosPessoa() {
        Pessoa p = new Pessoa("Nome Teste");
        assertEquals("Nome Teste", p.getNome());
        p.setLivros(new ArrayList<>());
        assertNotNull(p.getLivros());
    }
}