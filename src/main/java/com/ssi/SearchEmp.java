package com.ssi;

import org.hibernate.Session;

public class SearchEmp {

	public static void main(String[] args) {

		Session session=Util.getSF().openSession();
		Emp emp=session.get(Emp.class, "E113");
		
		System.out.println(emp.getEcode());
		System.out.println(emp.getEname());
		System.out.println(emp.getSal());
		System.out.println(emp.getLaptop().getLcode());
		System.out.println(emp.getLaptop().getBrand());
		System.out.println(emp.getLaptop().getPrice());
		session.close();
	
	}

}
