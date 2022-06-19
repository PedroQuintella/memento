public class JogadorSituacaoContratado implements JogadorSituacao {

    private JogadorSituacaoContratado() {};
    private static JogadorSituacaoContratado instance = new JogadorSituacaoContratado();
    public static JogadorSituacaoContratado getInstance() {
        return instance;
    }

    public String getNomeSituacao() {
        return "Contratado";
    }
}
