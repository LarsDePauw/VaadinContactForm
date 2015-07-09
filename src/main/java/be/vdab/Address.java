package be.vdab;

import java.io.Serializable;

public class Address implements Serializable{

    private String city;
    private String street;
    private int postalCode;

    public Address(String city, String street, int postalCode) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
