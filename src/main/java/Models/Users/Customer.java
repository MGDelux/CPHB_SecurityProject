package Models.Users;

import javax.persistence.*;
import java.io.Serializable;

/**
 * CREATED BY mathias @ 14-11-2021 - 14:06
 **/
@Entity(name="CustomerInfomation")

public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    boolean isCustomer;

    @OneToOne(cascade = CascadeType.PERSIST)
    Address address;
    double storeCredit;

    public Customer(boolean isCustomer, Address address, double storeCredit) {
        this.isCustomer = isCustomer;
        this.address = address;
        this.storeCredit = storeCredit;
    }

    public Customer() {

    }
}
