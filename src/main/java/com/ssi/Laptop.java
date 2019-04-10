package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Laptop {
	@Id
	private String lcode;
	private String brand;
	private int price;
	
	
	
	public Laptop() {
		super();
	}
	public Laptop(String lcode) {
		super();
		this.lcode = lcode;
	}
	public Laptop(String lcode, String brand, int price) {
		super();
		this.lcode = lcode;
		this.brand = brand;
		this.price = price;
	}
	public String getLcode() {
		return lcode;
	}
	public void setLcode(String lcode) {
		this.lcode = lcode;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [lcode=" + lcode + ", brand=" + brand + ", price="
				+ price + "]";
	}
	
	
}
