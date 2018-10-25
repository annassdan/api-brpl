package e.brpl.app.resthandlers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@SuppressWarnings("unused")
@ControllerAdvice
public class EBrplRestHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ IllegalArgumentException.class, IllegalStateException.class })
    protected ResponseEntity<?> errorConflict(RuntimeException exception, WebRequest request) {
        String bodyOfResponse = "This should be application specific";
        return handleExceptionInternal(exception, bodyOfResponse,
                new HttpHeaders(), HttpStatus.CONFLICT, request);
    }

    @ExceptionHandler({ Exception.class })
    protected ResponseEntity<?> error(Exception exception, WebRequest request) throws Exception {
        return handleException(exception, request);
    }

}
