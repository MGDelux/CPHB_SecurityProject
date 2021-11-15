package Models.Users;

/**
 * CREATED BY mathias @ 14-11-2021 - 14:06
 **/
public class Customer {
    boolean isCustomer;
    Address address;
    double storeCredit;

    public Customer(boolean isCustomer, Address address, double storeCredit) {
        this.isCustomer = isCustomer;
        this.address = address;
        this.storeCredit = storeCredit;
    }
}
