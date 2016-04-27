package org.moto;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by Nahid on 4/5/2016.
 */
public class HibernateApp {

    public static void main(String[] args){

        UserDetails user = new UserDetails();
//        user.setUserId(0);
//        user.setUserName("Nahid hasan ");
//        user.setDob(new Date());
//        user.setDescription("wow!!!!! hibernate is awesome ");
//        user.getAddress().setCity("Panchagarh");
//        user.getAddress().setState("Bangladesh");
//        user.getAddress().setPincode(1234);


        Vehicle ob1 = new Vehicle();
        ob1.setName("Audi R8");
        ob1.setUser(user);

        Vehicle ob2 = new Vehicle();
        ob2.setName("Mercedez Benz");
        ob2.setUser(user);

        List<Vehicle> ls =  new ArrayList<Vehicle>();
        ls.add(ob1);
        ls.add(ob2);

        user.setFavCar(ls);

        TwoWheeler bike = new TwoWheeler();
        bike.setUser(user);
        bike.setName("Yamaha FZ R7");
        bike.setHandlebarSteering("bike steering");

        FourWheeler car = new FourWheeler();
        car.setName("Audi R8");
        car.setWheelSteering("car steering");
        car.setUser(user);


/*
* this portion of code is for list of mobiles..
* */
//        Mobile ob =  new Mobile();
//        ob.setBrand("google");
//        ob.setName("Nexus 5");
//        ob.setPrice(32000);
//
//
//        Mobile ob1 =  new Mobile();
//        ob1.setBrand("samsung");
//        ob1.setName("galaxy s7 edge");
//        ob1.setPrice(52500);
//
//        Mobile ob2 =  new Mobile();
//        ob2.setBrand("HTC");
//        ob2.setName("htc one m8");
//        ob2.setPrice(40600);
//
//
//        ArrayList<Mobile> ls = new ArrayList<Mobile>();
//        ls.add(ob);
//        ls.add(ob1);
//        ls.add(ob2);
        //user.setListOfMobile(ls);

        //System.out.println(user.getListOfCars());
//        ls = (ArrayList<Mobile>)user.getListOfMobile();
//        System.out.println(ls.get(0).getName());


        SessionFactory sf =  new Configuration().configure().buildSessionFactory();
        Session session =  sf.openSession();
        session.beginTransaction();
//
//        session.save(user);
//        session.save(ob1);
//        session.save(ob2);
//        session.save(car);
//        session.save(bike);

        Criteria criteria = session.createCriteria(UserDetails.class);
        criteria.add(Restrictions.eq("userName","user 3"));


        List<UserDetails> oneUser = (List<UserDetails>) criteria.list();
        System.out.println(oneUser.get(0).getUserName());

        session.getTransaction().commit();
        session.close();



    }
}
