package Persistence.DAO;

import Models.User;

public interface LoginDao {
    public boolean verifyCredentials(User user);
}
