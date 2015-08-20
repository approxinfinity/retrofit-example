package com.approxinfinity.retrofitexample.models;

public class AddressModel {

    private GeoModel geo;
    private String zipcode;
    private String street;
    private String suite;
    private String city;
    public GeoModel getGeo() {
        return geo;
    }
    public void setGeo(GeoModel geo) {
        this.geo = geo;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getSuite() {
        return suite;
    }
    public void setSuite(String suite) {
        this.suite = suite;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
