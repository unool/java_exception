package exception;

public class CustomException extends RuntimeException{

    String code;

    public CustomException(String code) {
        this.code = code;
    }
}
