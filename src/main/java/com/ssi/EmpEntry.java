package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {

		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		
		
		Emp e1=new Emp();
		e1.setEcode("E111"); e1.setEname("AAA"); e1.setSal(55000);
		session.save(e1);
		
		Emp e2=new Emp();
		e2.setEcode("E112"); e2.setEname("BBB"); e2.setSal(65000);
		session.save(e2);
		tr.commit();
		session.close();
		System.out.println("Data Stored Successfully");
		

	}

}
