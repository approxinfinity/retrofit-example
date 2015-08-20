package com.approxinfinity.retrofitexample.models;

import java.io.Serializable;

/**
 * Created by kak476 on 8/19/15.
 */
public class CompanyModel implements Serializable
{
    private String catchPhrase;
    private String name;
    private String bs;
    public String getCatchPhrase() {
        return catchPhrase;
    }
    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBs() {
        return bs;
    }
    public void setBs(String bs) {
        this.bs = bs;
    }
}