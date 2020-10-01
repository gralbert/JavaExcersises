package lesson4;

public class TooManyLoginAttemptsException extends Exception {
    public TooManyLoginAttemptsException (String message){
        super(message);
    }
}
