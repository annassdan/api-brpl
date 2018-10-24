package e.brpl.resthandlers;

import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;
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

    @ExceptionHandler({ HttpRequestMethodNotSupportedException.class })
    protected ResponseEntity<?> errorHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException e, WebRequest request) {
        return handleHttpRequestMethodNotSupported(e, new HttpHeaders(), HttpStatus.METHOD_NOT_ALLOWED, request);
    }

    @ExceptionHandler({ HttpMediaTypeNotSupportedException.class })
    protected ResponseEntity<?> errorHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException e, WebRequest request) {
        return handleHttpMediaTypeNotSupported(e, new HttpHeaders(), HttpStatus.UNSUPPORTED_MEDIA_TYPE, request);
    }

    @ExceptionHandler({ HttpMediaTypeNotAcceptableException.class })
    protected ResponseEntity<?> errorHttpMediaTypeNotAcceptable(HttpMediaTypeNotAcceptableException e, WebRequest request) {
        return handleHttpMediaTypeNotAcceptable(e, new HttpHeaders(), HttpStatus.NOT_ACCEPTABLE, request);
    }

    @ExceptionHandler({ MissingPathVariableException.class })
    protected ResponseEntity<?> errorMissingPathVariable(MissingPathVariableException e, WebRequest request) {
        return handleMissingPathVariable(e, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    @ExceptionHandler({ MissingServletRequestParameterException.class, ServletRequestBindingException.class})
    protected ResponseEntity<?> errorMissingServletRequestParameter(MissingServletRequestParameterException e, WebRequest request) {
        return handleMissingServletRequestParameter(e, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler({ ConversionNotSupportedException.class })
    protected ResponseEntity<?> errorConversionNotSupported(ConversionNotSupportedException e, WebRequest request) {
        return handleConversionNotSupported(e, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    @ExceptionHandler({ TypeMismatchException.class })
    protected ResponseEntity<?> errorTypeMismatch(TypeMismatchException e, WebRequest request) {
        return handleTypeMismatch(e, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler({ HttpMessageNotReadableException.class })
    protected ResponseEntity<?> errorHttpMessageNotReadable(HttpMessageNotReadableException e, WebRequest request) {
        return handleHttpMessageNotReadable(e, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler({ HttpMessageNotWritableException.class })
    protected ResponseEntity<?> errorHttpMessageNotWritable(HttpMessageNotWritableException e, WebRequest request) {
        return handleHttpMessageNotWritable(e, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    @ExceptionHandler({ MethodArgumentNotValidException.class })
    protected ResponseEntity<?> errorMethodArgumentNotValid(MethodArgumentNotValidException e, WebRequest request) {
        return handleMethodArgumentNotValid(e, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler({ MissingServletRequestPartException.class })
    protected ResponseEntity<?> errorMissingServletRequestPart(MissingServletRequestPartException e, WebRequest request) {
        return handleMissingServletRequestPart(e, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler({ BindException.class })
    protected ResponseEntity<?> errorBindException(BindException e, WebRequest request) {
        return handleBindException(e, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler({ NoHandlerFoundException.class })
    protected ResponseEntity<?> errorNoHandlerFoundException(NoHandlerFoundException e, WebRequest request) {
        return handleNoHandlerFoundException(e, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler({ AsyncRequestTimeoutException.class })
    protected ResponseEntity<?> errorAsyncRequestTimeoutException(AsyncRequestTimeoutException e, WebRequest request) {
        return handleAsyncRequestTimeoutException(e, new HttpHeaders(), HttpStatus.SERVICE_UNAVAILABLE, request);
    }



}
