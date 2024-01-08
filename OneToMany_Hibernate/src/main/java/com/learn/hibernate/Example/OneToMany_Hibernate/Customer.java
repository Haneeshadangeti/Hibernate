package com.learn.hibernate.Example.OneToMany_Hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	int c_id;
	String c_name;
	int c_age;
	@OneToMany
	List<Product>p;		
	public Customer() {
				
	}
	public Customer(int c_id, String c_name, int c_age, List<Product> p) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_age = c_age;
		this.p = p;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getC_age() {
		return c_age;
	}
	public void setC_age(int c_age) {
		this.c_age = c_age;
	}
	public List<Product> getP() {
		return p;
	}
	public void setP(List<Product> p) {
		this.p = p;
	}

}
