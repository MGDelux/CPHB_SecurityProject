package Config.ErrorHandling;

public class WebPermissionException extends Exception{

    public WebPermissionException(String message) {
        super(message);
    }

    public WebPermissionException() {
        super("Sorry you do not have access to use this feature.");
    }
}
