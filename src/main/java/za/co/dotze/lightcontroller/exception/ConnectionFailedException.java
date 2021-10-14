package za.co.dotze.lightcontroller.exception;

public class ConnectionFailedException extends RuntimeException {
    public ConnectionFailedException(String exception) {
        super(exception);
    }

    public ConnectionFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
