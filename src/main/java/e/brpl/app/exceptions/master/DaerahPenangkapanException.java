package e.brpl.app.exceptions.master;

import e.brpl.app.utils.exception.EBrplRuntimeException;

@SuppressWarnings("unused")
public class DaerahPenangkapanException extends EBrplRuntimeException {

    public DaerahPenangkapanException() {
    }

    public DaerahPenangkapanException(String message) {
        super(message);
    }

    public DaerahPenangkapanException(String message, Throwable cause) {
        super(message, cause);
    }

    public DaerahPenangkapanException(Throwable cause) {
        super(cause);
    }

    public DaerahPenangkapanException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
