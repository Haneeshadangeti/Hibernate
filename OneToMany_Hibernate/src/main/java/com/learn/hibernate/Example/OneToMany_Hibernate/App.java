package com.learn.hibernate.Example.OneToMany_Hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Product p1=new Product();
    	Product p2=new Product();
    	Product p3=new Product();
    	Product p4=new Product();
    	
        List <Product> plist1=new ArrayList<Product>();
        List <Product> plist2=new ArrayList<Product>();
        plist1.add(p1);
        plist1.add(p2);
        plist2.add(p3);
        plist2.add(p4);
        
        
        Customer c1=new Customer(11,"Ankit",23,plist1);
        Customer c2=new Customer(22,"ajay",24,plist2);
        
        p1.setP_id(1111);
        p1.setP_name("Watch");
        p1.setP_cost(45000);
        p1.setC(c1);
        
        p2.setP_id(2222);
        p2.setP_name("moblie");
        p2.setP_cost(25000);
        p2.setC(c1);
        
        p3.setP_id(3333);
        p3.setP_name("Laptop");
        p3.setP_cost(80000);
        p3.setC(c2);
        
        p4.setP_id(4444);
        p4.setP_name("Bike");
        p4.setP_cost(95000);
        p4.setC(c2);
        
        Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	
    	s.save(c1);
    	s.save(c2);
    	s.save(p1);
    	s.save(p2);
    	s.save(p3);
    	s.save(p4);
    	
    	t.commit();
    	System.out.println("objects are saved");
      
    }
}
