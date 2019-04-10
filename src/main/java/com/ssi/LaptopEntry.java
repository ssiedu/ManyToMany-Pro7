package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class LaptopEntry {

	public static void main(String[] args) {

		Laptop l1=new Laptop("L111","Dell",40000);
		Laptop l2=new Laptop("L112","Hcl",50000);
		Laptop l3=new Laptop("L113","Hp",60000);

		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(l1); session.save(l2); session.save(l3);
		tr.commit();
		session.close();
		System.out.println("Data Stored1");
	}

}
