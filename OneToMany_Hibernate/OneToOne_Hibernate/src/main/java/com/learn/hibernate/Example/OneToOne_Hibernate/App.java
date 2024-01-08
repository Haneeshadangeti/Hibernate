package com.learn.hibernate.Example.OneToOne_Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	 Bike b1=new Bike();
         Bike b2=new Bike();
         Bike b3=new Bike();
         
         
        Configuration cfg=new Configuration().configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction trans=session.beginTransaction();
        
        Student1 st1=new Student1(11,"Ajay",23,b1);
        Student1 st2=new Student1(12,"amit",24,b2);
        Student1 st3=new Student1(13,"arun",21,b3);
        
        b1.setNum(1);
        b1.setName("Honda");
        b1.setCost(40000);
        b1.setSt(st1);
        
        b2.setNum(2);
        b2.setName("pulsar");
        b2.setCost(80000);
        b2.setSt(st2);
        
        b3.setNum(3);
        b3.setName("KTM");
        b3.setCost(70000);
        b3.setSt(st3);
     
        session.save(st1);
        session.save(st2);
        session.save(st3);
        
       
        session.save(b1);
        session.save(b2);
        session.save(b3);
        
        trans.commit();
        System.out.println("Row is inserted");
        
    }
}
