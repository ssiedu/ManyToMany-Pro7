package com.ssi;

import org.hibernate.Session;

public class SearchLaptop {

	public static void main(String[] args) {

		Session session=Util.getSF().openSession();
		Laptop laptop=session.get(Laptop.class, "L111");
		System.out.println("Laptop Details : ");
		System.out.println(laptop.getLcode());
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getPrice());
		session.close();
	}

}
