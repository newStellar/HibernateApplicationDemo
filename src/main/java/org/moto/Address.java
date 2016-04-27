package org.moto;

import javax.persistence.*;

/**
 * Created by Nahid on 4/6/2016.
 */

@Embeddable
public class Address {

    @Transient
    private int adId;
    private String city,state;
    private int pincode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
