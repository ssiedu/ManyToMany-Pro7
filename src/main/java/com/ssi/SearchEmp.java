package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchEmp {

	public static void main(String[] args) {

		Session session=Util.getSF().openSession();
		Emp emp=session.get(Emp.class, "E112");
		
		System.out.println(emp.getEcode());
		System.out.println(emp.getEname());
		System.out.println(emp.getSal());
		System.out.println("_____________________");
		List<Laptop> laptopList=emp.getLaptops();
		
		System.out.println("Laptop-Details : ");
		System.out.println("_____________________");
		for(Laptop laptop:laptopList){
			System.out.println(laptop.getLcode());
			System.out.println(laptop.getBrand());
			System.out.println(laptop.getPrice());
			System.out.println("_____________________");
		}
		
		
		
		session.close();
	
	}

}
