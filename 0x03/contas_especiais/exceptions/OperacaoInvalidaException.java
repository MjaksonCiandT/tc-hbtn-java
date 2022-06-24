package exceptions;

public class OperacaoInvalidaException extends Exception {
    private String Mensagem;

    public OperacaoInvalidaException(String mensagem) {
        super(mensagem);
        this.Mensagem=mensagem;
    }
}


