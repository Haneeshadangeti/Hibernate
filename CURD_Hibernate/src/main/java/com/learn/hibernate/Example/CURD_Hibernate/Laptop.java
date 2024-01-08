package com.learn.hibernate.Example.CURD_Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop 
{
	@Id
	int lap_num;
	String company;
	int price;
	public Laptop() {
	
	}
	public Laptop(int lap_num, String company, int price) {
		super();
		this.lap_num = lap_num;
		this.company = company;
		this.price = price;
	}
	public int getLap_num() {
		return lap_num;
	}
	public void setLap_num(int lap_num) {
		this.lap_num = lap_num;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [lap_num=" + lap_num + ", company=" + company + ", price=" + price + "]";
	}
	
	

}
