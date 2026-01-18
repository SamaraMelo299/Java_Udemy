package Exceptions.ex4.exceptions;

public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1l;

    public BusinessException (String msg) {
        super(msg);
    }
}
