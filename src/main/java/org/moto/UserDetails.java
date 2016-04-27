package org.moto;


import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


/**
 * Created by Nahid on 4/5/2016.
 */

@Entity
@Table(name = "user_details")
public class UserDetails {


    @Id
    private int userId;

    @Temporal(TemporalType.TIME)
    private Date Dob;

    @Embedded
    private Address address;

    private String userName;

    @Lob
    private String description;


    @ElementCollection
    private List<String> listOfCars;

    @OneToMany
    @JoinTable(name = "users_vehicle")
    private Collection <Vehicle> favCar = new ArrayList<Vehicle>();




//
//    /*
//    * in javabrain tutorial he used 'hilo' strategy. it is now deprecated.
//    * in this code sequence strategy is used instead of hilo
//    * */
//    @ElementCollection
//    @JoinTable(joinColumns = @JoinColumn(name="userId"))
//    @GenericGenerator(name="sequence-gen" ,strategy = "sequence")
//    @CollectionId(columns ={@Column(name="mob_id")} ,generator ="sequence-gen" ,type =@Type(type="long"))
//    private Collection<Mobile> listOfMobile= new ArrayList<Mobile>();
//

    public UserDetails(){

        this.address = new Address();

        this.listOfCars = new ArrayList<String>();
        this.listOfCars.add("BMW");
        this.listOfCars.add("Audi");
        this.listOfCars.add("Ferrarie");
    }


//    public Collection<Mobile> getListOfMobile() {return listOfMobile;}
//
//    public void setListOfMobile(ArrayList<Mobile> listOfMobile) {this.listOfMobile = listOfMobile;}

    public List<String> getListOfCars() {return listOfCars;}

    public void setListOfCars(List<String> listOfCars) {this.listOfCars = listOfCars;}

    public Address getAddress() {return address;}

    public void setAddress(Address address) {this.address = address;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public Date getDob() {return Dob;}

    public void setDob(Date dob) {Dob = dob;}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Collection<Vehicle> getFavCar() {return favCar;}

    public void setFavCar(List<Vehicle> favCar) {this.favCar = favCar;}
}
