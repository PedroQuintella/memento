public class JogadorSituacaoEmprestado implements JogadorSituacao {

    private JogadorSituacaoEmprestado() {};
    private static JogadorSituacaoEmprestado instance = new JogadorSituacaoEmprestado();
    public static JogadorSituacaoEmprestado getInstance() {
        return instance;
    }

    public String getNomeSituacao() {
        return "Emprestado";
    }
}
