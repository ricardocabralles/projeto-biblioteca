package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class PessoaTest {

    @Test
    public void testGetSetNome() {
        Pessoa pessoa = new Pessoa("Nome Teste");
        
        assertEquals("Nome Teste", pessoa.getNome());
        
        pessoa.setNome("Novo Nome");
        assertEquals("Novo Nome", pessoa.getNome());
    }

    @Test
    public void testGetSetLivros() {
        Pessoa pessoa = new Pessoa("Usuario Exemplo");
        List<Livro> listaLivros = new ArrayList<>();
        
        Autor autor = new Autor("Autor Exemplo", "Nacionalidade Exemplo");
        Livro livro = new Livro("Livro Teste", autor, "Genero Teste", true);
        listaLivros.add(livro);
        
        pessoa.setLivros(listaLivros);
        
        assertNotNull(pessoa.getLivros());
        assertEquals(1, pessoa.getLivros().size());
        assertEquals("Livro Teste", pessoa.getLivros().get(0).getTitulo());
    }
}