package e.brpl.exceptions.master;

import e.brpl.utils.exception.EBrplException;

@SuppressWarnings("unused")
public class DaerahPenangkapanException extends EBrplException {

    public DaerahPenangkapanException(String message) {
        super(message);
    }

    public DaerahPenangkapanException(String message, Throwable cause) {
        super(message, cause);
    }

    public DaerahPenangkapanException(Throwable cause) {
        super(cause);
    }
}
