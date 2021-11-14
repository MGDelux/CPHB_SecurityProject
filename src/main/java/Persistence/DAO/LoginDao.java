package Persistence.DAO;

import Models.Users.BaseUser;

public interface LoginDao {
    public boolean verifyCredentials(BaseUser baseUser);
}
