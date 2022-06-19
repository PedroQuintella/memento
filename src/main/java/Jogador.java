import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private JogadorSituacao situacao;
    private List<JogadorSituacao> memento = new ArrayList<JogadorSituacao>();

    public JogadorSituacao getSituacao() {
        return this.situacao;
    }

    public void setSituacao(JogadorSituacao situacao) {
        this.situacao = situacao;
        this.memento.add(this.situacao);
    }

    public void restauraSituacao(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.situacao = this.memento.get(indice);
    }

    public List<JogadorSituacao> getSituacoes() {
        return this.memento;
    }
}
