package Models.Users;

import Dependencies.EMF_Creator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * CREATED BY mathias @ 14-11-2021 - 17:39
 **/
class BaseUserTest {
    private static EntityManagerFactory emf;
    private static BaseUser user;


    @BeforeAll
    public static void SetUpClass() {
        emf = EMF_Creator.createEntityManagerFactoryForTest();
    }

    @BeforeEach
    public void SetUp() throws Exception {
        List<Permissions> permissionList = new ArrayList<>();
        //EXAMPLE DEFAULT USER CREATION
        Address address = new Address("Street bla 1", "25", 3400, "Hillerød", "Denmark");
        Customer customer = new Customer(true, address, 25);

        user = new BaseUser("test@mail.com", "password");
        user.setUserPermissions(permissionList);
    }

    @Test
    void addPermissionToUser() throws Exception {
        Permissions newperm = new Permissions("add to basket", Permissions.UserPermissions.ADD_TO_BASKET);
        Permissions newperm2 = new Permissions("modify a user", Permissions.UserPermissions.MODIFY_USER);
        Permissions newperm3 = new Permissions("ADD_PRODUCT", Permissions.UserPermissions.ADD_PRODUCT);
        Permissions newperm4 = new Permissions("DELETE_PRODUCT", Permissions.UserPermissions.DELETE_PRODUCT);
        Permissions newperm5 = new Permissions("VIEW_ADMIN_PAGE", Permissions.UserPermissions.VIEW_ADMIN_PAGE);


        user.addPermissionToUser(newperm);
        user.addPermissionToUser(newperm2);
        user.addPermissionToUser(newperm3);
        user.addPermissionToUser(newperm4);
        user.addPermissionToUser(newperm5);

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(user);
        em.getTransaction().commit();
        System.out.print("TO>DB\n");
        System.out.print(user.toString());
        System.out.println("\nFROM DB:");
        BaseUser person = em.find(BaseUser.class,user.getId());
        System.out.print(person.toString());
        List<Permissions> getperms = new ArrayList<>();
        getperms = user.getUserPermissions();
        for (Permissions p:getperms
             ) {
            if (p.getPermissions().equals(Permissions.UserPermissions.MODIFY_USER)){
                //IF THE PERSON HAS THE PERMISSION DO SOMETHING...
                System.out.print("\n"+person.getEmail() +" = " +p.getPermissions());
            }else {
                //ELSE DONT THROW WARNING ECT
                System.out.print("\n"+Permissions.UserPermissions.MODIFY_USER + " /= "+ p.getPermissions());
            }

        }

    }
}