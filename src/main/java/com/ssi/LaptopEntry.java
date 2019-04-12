package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LaptopEntry {

	public static void main(String[] args) {

		Emp e1=new Emp("E111");
		Emp e2=new Emp("E112");
		
		
		Laptop l1=new Laptop("L111","Dell",40000); l1.setEmp(e1);
		Laptop l2=new Laptop("L112","Hcl",50000); l2.setEmp(e1);
		Laptop l3=new Laptop("L113","Hp",60000); l3.setEmp(e2);
		Laptop l4=new Laptop("L114","Sony",70000); l4.setEmp(e2);
		Laptop l5=new Laptop("L115","Mac",90000);  l5.setEmp(e2);

		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(l1); session.save(l2); session.save(l3);session.save(l4); session.save(l5);
		tr.commit();
		session.close();
		System.out.println("Data Stored1");
	}

}
