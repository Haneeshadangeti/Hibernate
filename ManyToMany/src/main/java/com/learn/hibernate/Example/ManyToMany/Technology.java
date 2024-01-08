package com.learn.hibernate.Example.ManyToMany;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technology 
{
	@Id
	int T_Id;
	String T_name;
	@ManyToMany
	List <Employee1>emp;
	public Technology() {
		
	}
	public Technology(int t_Id, String t_name, List<Employee1> emp) {
		super();
		T_Id = t_Id;
		T_name = t_name;
		this.emp = emp;
	}
	public int getT_Id() {
		return T_Id;
	}
	public void setT_Id(int t_Id) {
		T_Id = t_Id;
	}
	public String getT_name() {
		return T_name;
	}
	public void setT_name(String t_name) {
		T_name = t_name;
	}
	public List<Employee1> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee1> emp) {
		this.emp = emp;
	}
	
	
	

}
