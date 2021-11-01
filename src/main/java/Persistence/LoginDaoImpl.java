package Persistence;

import Dependencies.IMysqlConnection;
import Dependencies.MysqlConnection;
import Models.User;
import Persistence.DAO.LoginDao;

public class LoginDaoImpl implements LoginDao {

    private IMysqlConnection imc;

    public LoginDaoImpl() {
        this.imc = new MysqlConnection(); // loose coupling
    }

    @Override
    public boolean verifyCredentials(User user) {
        return false;
    }


}
