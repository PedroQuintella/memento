import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveArmazenarSituacoes() {
        Jogador jogador = new Jogador();
        jogador.setSituacao(JogadorSituacaoEmprestado.getInstance());
        jogador.setSituacao(JogadorSituacaoContratado.getInstance());
        assertEquals(2, jogador.getSituacoes().size());
    }

    @Test
    void deveRetornarSituacaoInicial() {
        Jogador jogador = new Jogador();
        jogador.setSituacao(JogadorSituacaoEmprestado.getInstance());
        jogador.setSituacao(JogadorSituacaoContratado.getInstance());
        jogador.restauraSituacao(0);
        assertEquals(JogadorSituacaoEmprestado.getInstance(), jogador.getSituacao());
    }

    @Test
    void deveRetornarSituacaoAnterior() {
        Jogador jogador = new Jogador();
        jogador.setSituacao(JogadorSituacaoEmprestado.getInstance());
        jogador.setSituacao(JogadorSituacaoVendido.getInstance());
        jogador.setSituacao(JogadorSituacaoEmprestado.getInstance());
        jogador.setSituacao(JogadorSituacaoContratado.getInstance());
        jogador.restauraSituacao(2);
        assertEquals(JogadorSituacaoEmprestado.getInstance(), jogador.getSituacao());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Jogador jogador = new Jogador();
            jogador.restauraSituacao(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}