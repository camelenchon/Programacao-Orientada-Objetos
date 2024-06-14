package exceptions;

public class PrecoInvalidoException extends Exception {
    public PrecoInvalidoException() {
        super("Tem que ser um valor acima Zero!");
    }
}
