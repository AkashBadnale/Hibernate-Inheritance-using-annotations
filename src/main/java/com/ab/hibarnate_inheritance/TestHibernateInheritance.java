package com.ab.hibarnate_inheritance;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @ Programmer -
 *     AKASH BADNALE
 *
 */
public class TestHibernateInheritance 
{
    public static void main( String[] args )
    {
         Session  session  =  HibernateUtil.getSession();
         Transaction  tx  = session.beginTransaction();
         
         Bike onlyBike = new Bike(0,"pulsar","mix");
         Bike  myBike1  = new  FZ16(1, "FZ16", "simple+sport", 153, 53,1);
         Bike  myBike2 = new CBR250(2,"CBR250","only sports",250,25,5);
         
         session.save(onlyBike);
         session.save(myBike1);
         session.save(myBike2);
         
         HibernateUtil.flushNcommit(session, tx);
         session.close();
    }//main
}//TestHibernateinheritance
