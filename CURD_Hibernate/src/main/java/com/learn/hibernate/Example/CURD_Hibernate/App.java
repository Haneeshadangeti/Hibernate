package com.learn.hibernate.Example.CURD_Hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		System.out.println("enter the 1 for creating a table,2 for retriving the data,3 updating the data,4 for deleting the data");
		Scanner scan=new Scanner(System.in);
		int choice=scan.nextInt();
		switch(choice) 
		{
		case 1:
			create(s,t);
		    break;
		case 2:
			read(s,t); 
			break;
		case 3:
			update(s,t);
			break;
		case 4:
			delete(s,t);
			break;
		default: System.out.println("enter the valid number");
		}
	}
	public static void create(Session s,Transaction t)
	{
		Laptop lap1=new Laptop(11,"Dell",45000);
		s.save(lap1);
		t.commit();
		System.out.println("Object is saved");   	
	}
	public static void read(Session s,Transaction t)
	{
		Laptop lap=s.get(Laptop.class,11);
		t.commit();
		System.out.println(lap);  	
	}
	public static void update(Session s,Transaction t)
	{
		Laptop lap=s.get(Laptop.class,11);
		lap.setCompany("Hp");
		s.save(lap);
		t.commit();
	}
	public static void delete(Session s,Transaction t)
	{
		Laptop l=new Laptop(12,"dell",45000);	
		s.save(l);
		s.delete(l);
		t.commit();
	}
}
