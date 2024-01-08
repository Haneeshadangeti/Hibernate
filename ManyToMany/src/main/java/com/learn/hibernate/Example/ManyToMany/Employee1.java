package com.learn.hibernate.Example.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee1
{
	@Id
	int emp_Id;
	String emp_name;
	String emp_Team;
	
	@ManyToMany
	List<Technology> tech;

	public Employee1() {
		
	}

	public Employee1(int emp_Id, String emp_name, String emp_Team, List<Technology> tech) {
		super();
		this.emp_Id = emp_Id;
		this.emp_name = emp_name;
		this.emp_Team = emp_Team;
		this.tech = tech;
	}

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_Team() {
		return emp_Team;
	}

	public void setEmp_Team(String emp_Team) {
		this.emp_Team = emp_Team;
	}

	public List<Technology> getTech() {
		return tech;
	}

	public void setTech(List<Technology> tech) {
		this.tech = tech;
	}

	
	

}
