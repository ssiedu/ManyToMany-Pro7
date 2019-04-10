package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {

		Session session=Util.getSF().openSession();
		
		Laptop l1=new Laptop("L111");
		Laptop l2=new Laptop("L112");
		Laptop l3=new Laptop("L113");
		
		Emp e1=new Emp("E111","AAA",50000,l1);
		Emp e2=new Emp("E112","BBB",60000,l2);
		Emp e3=new Emp("E113","CCC",70000,l3);
		
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2); session.save(e3);
		tr.commit();
		session.close();
		System.out.println("Data Stored Successfully");
		

	}

}
