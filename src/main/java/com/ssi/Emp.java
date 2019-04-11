package com.ssi;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Emp {
	@Id
	private String ecode;
	private String ename;
	private int sal;

	@OneToOne(fetch=FetchType.LAZY)
	private Laptop laptop;
	
	public Emp() {
		super();
	}
	
	public Emp(String ecode) {
		super();
		this.ecode = ecode;
	}

	public Emp(String ecode, String ename, int sal, Laptop laptop) {
		super();
		this.ecode = ecode;
		this.ename = ename;
		this.sal = sal;
		this.laptop = laptop;
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
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Emp [ecode=" + ecode + ", ename=" + ename + ", sal=" + sal
				+ ", laptop=" + laptop + "]";
	}
	
	
}
