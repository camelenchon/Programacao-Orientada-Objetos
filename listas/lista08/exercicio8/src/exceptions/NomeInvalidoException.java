package exceptions;

public class NomeInvalidoException extends Exception {
    public NomeInvalidoException() {
        super("O nome deve ter pelo menos 3 caracteres!");
    }
}
