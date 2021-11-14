package Models.Users;

import Config.EntityManagerCreator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import static org.junit.jupiter.api.Assertions.*;
/**
  * CREATED BY mathias @ 14-11-2021 - 17:39
**/
    class BaseUserTest {
    private static EntityManagerFactory emf;



    @BeforeAll
    public static void SetUpClass(){
        emf = EntityManagerCreator.CreateEntityManagerTest();
    }
 @BeforeEach
 public void SetUp() throws Exception {
     EntityManager em = emf.createEntityManager();
     BaseUser user = new BaseUser("test@mail.com","password");
     user.addPermissionToUser(Permissions.WebsitePermission.ADD_PRODUCT);
 }

    @Test
    void addPermissionToUser() throws Exception {

        System.out.println("test");
    }
}