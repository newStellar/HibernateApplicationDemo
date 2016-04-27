package org.moto;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Nahid on 4/6/2016.
 */

@Embeddable
public class Mobile {

    private String name,brand;
    private int price;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getBrand() {return brand;}

    public void setBrand(String brand) {this.brand = brand;}

    public int getPrice() {return price;}

    public void setPrice(int price) {this.price = price; }
}
