package exceptions;

public class BusinessException extends RuntimeException {
    private static final long serialversionUID = 1L;

    public BusinessException(String msg) {
        super(msg);
    }
}
