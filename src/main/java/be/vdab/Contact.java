package be.vdab;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.io.Serializable;
import java.util.Date;

public class Contact implements Serializable {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private Gender gender;
    @Past
    private Date birthDay;
    @Valid
    private Address address = new Address();

    public Contact(String firstName, String lastName, Gender gender, Date birthDay, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.address = address;
    }

    public Contact() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        return "(firstname: " + firstName + ", lastname: " + lastName + ")";
    }
}
