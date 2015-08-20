package com.approxinfinity.retrofitexample.models;

import android.location.Address;

import java.io.Serializable;

/**
 * Created by kak476 on 8/19/15.
 */
public class UserModel implements Serializable
{
    private int id;
    private String phone;
    private String username;
    private String website;
    private Address address;
    private String email;
    private CompanyModel company;
    private String name;

    // region getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public CompanyModel getCompany() {
        return company;
    }
    public void setCompany(CompanyModel company) {
        this.company = company;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // endregion
}
