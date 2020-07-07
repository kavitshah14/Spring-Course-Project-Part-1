package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(nullable = false)
    private String firstName;

    private String lastName;

    @Column(nullable = false)
    private String password;

    @Column(unique = true , nullable = false)
    private String email;

    @Column(unique = true , nullable = false)
    private String mobileNumber;

    @Column(nullable = false)
    private float walletMoney;

    @OneToMany
    List<Role> role;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public float getWalletMoney() {
        return walletMoney;
    }

    public void setWalletMoney(float walletMoney) {
        this.walletMoney = walletMoney;
    }

    public Users() {}

    public Users(String firstName, String lastName, String password, String email, String mobileNumber, float walletMoney) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.walletMoney = walletMoney;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", walletMoney=" + walletMoney +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return userId == users.userId &&
                Float.compare(users.walletMoney, walletMoney) == 0 &&
                Objects.equals(firstName, users.firstName) &&
                Objects.equals(lastName, users.lastName) &&
                Objects.equals(password, users.password) &&
                Objects.equals(email, users.email) &&
                Objects.equals(mobileNumber, users.mobileNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, firstName, lastName, password, email, mobileNumber, walletMoney);
    }
}
