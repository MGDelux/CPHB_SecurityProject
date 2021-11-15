package Models.Users;

import Config.EntityManagerCreator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
  * CREATED BY mathias @ 14-11-2021 - 17:39
**/
    class BaseUserTest {
    private static EntityManagerFactory emf;
    private static BaseUser user;



    @BeforeAll
    public static void SetUpClass(){
        emf = EntityManagerCreator.CreateEntityManagerTest();
    }
 @BeforeEach
 public void SetUp() throws Exception {
     List<Permissions.UserPermissions> permissionList = new ArrayList<>();
     //EXAMPLE DEFAULT USER CREATION
     Address address = new Address("Street bla 1","25",3400,"Hillerød","Denmark");
     Customer customer = new Customer(true,address,25);
     permissionList.add(Permissions.UserPermissions.VIEW_PERSONAL_USER_PAGE);
     permissionList.add(Permissions.UserPermissions.ADD_TO_BASKET);
     permissionList.add(Permissions.UserPermissions.UPLOAD_PROFILE_PICTURE);
     EntityManager em = emf.createEntityManager();
     user = new BaseUser("test@mail.com","password");
     user.setUserPermissions(permissionList);
 }

    @Test
    void addPermissionToUser() throws Exception {
      user.addPermissionToUser(Permissions.UserPermissions.MODIFY_USER);
        System.out.println("test");
    }
}