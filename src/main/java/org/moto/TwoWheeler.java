package org.moto;

import javax.persistence.Entity;

/**
 * Created by Nahid on 4/11/2016.
 */

@Entity
public class TwoWheeler extends Vehicle{

    String handlebarSteering;

    public String getHandlebarSteering() {
        return handlebarSteering;
    }

    public void setHandlebarSteering(String handlebarSteering) {
        this.handlebarSteering = handlebarSteering;
    }
}
