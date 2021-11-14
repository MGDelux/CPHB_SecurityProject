package Models.Users;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;

@Entity(name="Users")
public class BaseUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    @NotNull
    @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
            +"[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
            +"(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
            message="{invalid.email}")
    @Column(name="Email")
    protected String email;
    @Column(name="Name")
    private String username;
    @NotNull
    @Size(min = 4, max = 255)
    @Column(name="Password")
    private String saltedPassword;
     @Column(name="ProfilePicture")
    private byte[] profilePicture; //we store images as bytes for db
    @Column(name="userPermissions")
    @OneToMany(targetEntity = Permissions.class,cascade = CascadeType.PERSIST,fetch =  FetchType.EAGER)
    private List<Permissions.WebsitePermission> userPermissions;
    @Column(name="CustomerInfomation")
    private Customer customerInfomation;

    public BaseUser(@NotNull @Pattern(regexp = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\." + "[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@" + "(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message = "{invalid.email}") String email, @NotNull String saltedPassword) {
        this.email = email;
        this.saltedPassword = BCrypt.hashpw(saltedPassword,BCrypt.gensalt(15));
    }

    public BaseUser() {

    }

    public void addPermissionToUser(Permissions.WebsitePermission perm) throws Exception {
        try {
            userPermissions.add(perm);
        }catch (Exception e){
            throw new Exception("ERROR"); //TODO CUSTOM EXCEPTION
        }

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }



    public void setCustomerInfomation(Customer customerInfomation) {
        this.customerInfomation = customerInfomation;
    }

    public String getUsername() {
        return username;
    }

    public byte[] getProfilePicture() {
        return profilePicture;
    }



    public Customer getCustomerInfomation() {
        return customerInfomation;
    }

    //TODO DTO TOSTRING()
}
