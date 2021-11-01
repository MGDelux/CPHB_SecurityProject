package Service;

import Persistence.DAO.LoginDao;
import Persistence.LoginDaoImpl;

public class LoginService implements ILoginService {

    private LoginDao ldi;

    public LoginService() {
        ldi = new LoginDaoImpl();
    }

    @Override
    public boolean verifyCredentials(String username, String password) {
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }

    @Override
    public boolean isLoggedin() {
        return false;
    }
}
