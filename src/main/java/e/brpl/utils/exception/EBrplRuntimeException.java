package e.brpl.utils.exception;

@SuppressWarnings("unused")
public class EBrplRuntimeException extends RuntimeException {

    public EBrplRuntimeException() {
    }

    public EBrplRuntimeException(String message) {
        super(message);
    }

    public EBrplRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public EBrplRuntimeException(Throwable cause) {
        super(cause);
    }

    public EBrplRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
