package e.brpl.exceptions;

@SuppressWarnings("unused")
public class EBrplExceptions extends Exception {

    public EBrplExceptions(String message) {
        super(message);
    }

    public EBrplExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public EBrplExceptions(Throwable cause) {
        super(cause);
    }
}
