package com.mycompany.app;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmprestimoTest {
    @Test
    public void testDadosEmprestimo() {
        Autor autor = new Autor("Alan Turing", "Inglês", false);
        Livro livro = new Livro("Java Basics", autor, "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emp = new Emprestimo(livro, usuario);

        assertEquals("Gabriel", emp.getUsuario().getNome());
        assertEquals("Java Basics", emp.getLivro().getTitulo());
        assertNotNull(emp.getDataRetirada());
    }
}