package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {

		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		
		Laptop l1=new Laptop("L111");
		Laptop l2=new Laptop("L112");
		Laptop l3=new Laptop("L113");
		Laptop l4=new Laptop("L114");
		Laptop l5=new Laptop("L115");
		Emp e1=new Emp();
		e1.setEcode("E111"); e1.setEname("AAA"); e1.setSal(55000);
		e1.getLaptops().add(l1);
		e1.getLaptops().add(l2);
		session.save(e1);
		Emp e2=new Emp();
		e2.setEcode("E112"); e2.setEname("BBB"); e2.setSal(65000);
		e2.getLaptops().add(l3); 
		e2.getLaptops().add(l4);
		e2.getLaptops().add(l5);
		session.save(e2);
		tr.commit();
		session.close();
		System.out.println("Data Stored Successfully");
		

	}

}
