package org.moto;

import javax.persistence.*;

/**
 * Created by Nahid on 4/7/2016.
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

/*
* @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) --> this strategy is better
* */
public class Vehicle {

    @Id @GeneratedValue
    private int vehicleId;
    private String Name;

    @ManyToOne
    private UserDetails user;


    public UserDetails getUser() {
        return user;
    }

    public void setUser(UserDetails user) {
        this.user = user;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
