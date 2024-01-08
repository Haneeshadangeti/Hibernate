package com.learn.hibernate.Example.ManyToMany;

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
    	List<Employee1> emplist1=new ArrayList<Employee1>();
     	List<Employee1> emplist2=new ArrayList<Employee1>();
     	List<Employee1> emplist3=new ArrayList<Employee1>();
     	List<Employee1> emplist4=new ArrayList<Employee1>();
     	
     	Employee1 emp1=new Employee1();
     	Employee1 emp2=new Employee1();
     	Employee1 emp3=new Employee1();
     	Employee1 emp4=new Employee1();
     	Employee1 emp5=new Employee1();
     	     	
     	List<Technology> techlist1=new ArrayList<Technology>();
     	List<Technology> techlist2=new ArrayList<Technology>();
     	List<Technology> techlist3=new ArrayList<Technology>();
     	List<Technology> techlist4=new ArrayList<Technology>();
     	List<Technology> techlist5=new ArrayList<Technology>();
     	
     	Technology t1=new Technology();
     	Technology t2=new Technology();
     	Technology t3=new Technology();
     	Technology t4=new Technology();
     	
     	emplist1.add(emp1);
     	emplist1.add(emp3);
     	emplist1.add(emp5);
     	
     	emplist2.add(emp1);
     	emplist2.add(emp2);
     	emplist2.add(emp4);
     	emplist2.add(emp5);
     	
     	emplist3.add(emp2);
     	emplist3.add(emp4);
     	emplist3.add(emp5);
     	
     	emplist4.add(emp1);
     	emplist4.add(emp2);
     	emplist4.add(emp3);
     	emplist4.add(emp4);
     	emplist4.add(emp5);
     	
     	emp1.setEmp_Id(11);
     	emp1.setEmp_name("Prakash");
     	emp1.setEmp_Team("Team-A");
     	emp1.setTech(techlist1);
     	
     	emp2.setEmp_Id(12);
     	emp2.setEmp_name("Praveen");
     	emp2.setEmp_Team("Team-B");
     	emp2.setTech(techlist2);
     	
     	emp3.setEmp_Id(13);
     	emp3.setEmp_name("Pooja");
     	emp3.setEmp_Team("Team-C");
     	emp2.setTech(techlist2);
     	
     	emp4.setEmp_Id(14);
     	emp4.setEmp_name("Priya");
     	emp4.setEmp_Team("Team-A");
     	emp4.setTech(techlist4);
     	
     	emp5.setEmp_Id(15);
     	emp5.setEmp_name("Prateek");
     	emp5.setEmp_Team("Team-B");
     	emp5.setTech(techlist5);
     	
     	techlist1.add(t1);
     	techlist1.add(t2);
     	techlist1.add(t4);
     	
     	techlist2.add(t2);
     	techlist2.add(t3);
     	techlist2.add(t4);
     	
     	techlist3.add(t1);
     	techlist3.add(t4);
     	
     	techlist4.add(t2);
     	techlist4.add(t3);
     	techlist4.add(t4);
     	
     	techlist5.add(t1);
     	techlist5.add(t2);
     	techlist5.add(t3);
     	techlist5.add(t4);
     	
     	t1.setT_Id(123);
     	t1.setT_name("Java");
     	t1.setEmp(emplist1);
     	
     	t2.setT_Id(124);
     	t2.setT_name("MySql");
     	t2.setEmp(emplist2);
          	
     	t3.setT_Id(125);
     	t3.setT_name("python");
     	t3.setEmp(emplist3);
     	     	
     	t4.setT_Id(126);
     	t4.setT_name("React");
     	t4.setEmp(emplist4);
     	    	   	
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	
    	s.save(emp1);
    	s.save(emp2);
    	s.save(emp3);
    	s.save(emp4);
    	s.save(emp5);
    	
    	s.save(t1);
    	s.save(t2);
    	s.save(t3);
    	s.save(t4);
    	
    	t.commit();
    	
    	System.out.println("objects are saved");
    	
    	
    	
    	
    	 
       
    }
}
