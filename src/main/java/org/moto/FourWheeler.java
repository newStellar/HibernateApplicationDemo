package org.moto;

import javax.persistence.Entity;

/**
 * Created by Nahid on 4/11/2016.
 */

@Entity
public class FourWheeler extends Vehicle {

    String wheelSteering;

    public String getWheelSteering() {
        return wheelSteering;
    }

    public void setWheelSteering(String wheelSteering) {
        this.wheelSteering = wheelSteering;
    }
}
