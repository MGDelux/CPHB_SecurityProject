package Config.ErrorHandling;

public class DBPermissionException extends Exception{

    public DBPermissionException(String message) {
        super(message);
    }

    public DBPermissionException() {
        super("You do not have permission to use this feature.");
    }
}
