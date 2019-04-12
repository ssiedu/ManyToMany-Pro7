package com.ssi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Emp {
	@Id
	private String ecode;
	private String ename;
	private int sal;

	@OneToMany(mappedBy="emp")
	private List<Laptop> laptops=new ArrayList<Laptop>();
	
	public Emp() {
		super();
	}
	
	public Emp(String ecode) {
		super();
		this.ecode = ecode;
	}
	
	public Emp(String ecode, String ename, int sal, List<Laptop> laptops) {
		super();
		this.ecode = ecode;
		this.ename = ename;
		this.sal = sal;
		this.laptops = laptops;
	}

	public String getEcode() {
		return ecode;
	}
	public void setEcode(String ecode) {
		this.ecode = ecode;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

	
}
