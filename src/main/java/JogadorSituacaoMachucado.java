public class JogadorSituacaoMachucado implements JogadorSituacao {

    private JogadorSituacaoMachucado() {};
    private static JogadorSituacaoMachucado instance = new JogadorSituacaoMachucado();
    public static JogadorSituacaoMachucado getInstance() {
        return instance;
    }

    public String getNomeSituacao() {
        return "Machucado";
    }
}
