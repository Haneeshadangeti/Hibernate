package com.learn.hibernate.Example.OneToMany_Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product 
{
	@Id
	int p_id;
	String p_name;
	int p_cost;
	@ManyToOne
	Customer c;
	public Product(int p_id, String p_name, int p_cost, Customer c) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_cost = p_cost;
		this.c = c;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_cost() {
		return p_cost;
	}
	public void setP_cost(int p_cost) {
		this.p_cost = p_cost;
	}
	public Customer getC() {
		return c;
	}
	public void setC(Customer c) {
		this.c = c;
	}
	
	
	

}
