package Service;

public interface ILoginService {
    public boolean verifyCredentials(String username, String password);
    public boolean logout();
    public boolean isLoggedin();
}
