package com.learn.hibernate.Example.OneToOne_Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike 
{
	@Id
	int num;
	String name;
	int cost;
	@OneToOne
	Student1 st;
	public Bike() {
	
	}
	public Bike(int num, String name, int cost,Student1 st) {
		
		this.num = num;
		this.name = name;
		this.cost = cost;
		this.st=st;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Student1 getSt() {
		return st;
	}
	public void setSt(Student1 st) {
		this.st = st;
	}
	
}
