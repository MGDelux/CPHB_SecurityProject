package Models.Users;

/**
 * CREATED BY mathias @ 14-11-2021 - 14:29
 **/
public class Address {
    String shippingAdress;
    String houseNumber;
    int shippingZipCode;
    String shippingCity;
    String country;

    public Address(String shippingAdress, String houseNumber, int shippingZipCode, String shippingCity, String country) {
        this.shippingAdress = shippingAdress;
        this.houseNumber = houseNumber;
        this.shippingZipCode = shippingZipCode;
        this.shippingCity = shippingCity;
        this.country = country;
    }

    public String getShippingAdress() {
        return shippingAdress;
    }

    public void setShippingAdress(String shippingAdress) {
        this.shippingAdress = shippingAdress;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getShippingZipCode() {
        return shippingZipCode;
    }

    public void setShippingZipCode(int shippingZipCode) {
        this.shippingZipCode = shippingZipCode;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
