package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LaptopEntry {

	public static void main(String[] args) {

		Laptop l1=new Laptop("L111","Dell",40000);
		Laptop l2=new Laptop("L112","Hcl",50000);
		Laptop l3=new Laptop("L113","Hp",60000);
		Laptop l4=new Laptop("L114","Sony",70000);
		Laptop l5=new Laptop("L115","Mac",90000);

		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(l1); session.save(l2); session.save(l3);session.save(l4); session.save(l5);
		tr.commit();
		session.close();
		System.out.println("Data Stored1");
	}

}
