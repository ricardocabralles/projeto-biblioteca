package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    public void testTrocaDeEstrategia() {
        Autor autor = new Autor("Alan Turing", "Inglês", true);
        
        // Testando se inicia vazio
        autor.publicar(); // Não deve quebrar o código
        
        // Validando que podemos definir uma estratégia sem erros
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        assertDoesNotThrow(() -> autor.publicar());
        
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        assertDoesNotThrow(() -> autor.publicar());
    }
}