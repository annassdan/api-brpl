package e.brpl.app.utils.exception;

@SuppressWarnings("unused")
public class EBrplException extends Exception {

    public EBrplException(String message) {
        super(message);
    }

    public EBrplException(String message, Throwable cause) {
        super(message, cause);
    }

    public EBrplException(Throwable cause) {
        super(cause);
    }
}
