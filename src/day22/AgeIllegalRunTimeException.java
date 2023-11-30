package day22;

/**
 * 必须让这个类继承自RuntimeException,才能成为一个异常类
 */
public class AgeIllegalRunTimeException extends RuntimeException {
    public AgeIllegalRunTimeException() {
        super();
    }

    public AgeIllegalRunTimeException(String message) {
        super(message);
    }
}
