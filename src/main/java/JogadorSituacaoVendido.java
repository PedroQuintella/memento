public class JogadorSituacaoVendido implements JogadorSituacao {

    private JogadorSituacaoVendido() {};
    private static JogadorSituacaoVendido instance = new JogadorSituacaoVendido();
    public static JogadorSituacaoVendido getInstance() {
        return instance;
    }

    public String getNomeSituacao() {
        return "Vendido";
    }
}
