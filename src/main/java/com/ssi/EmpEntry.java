package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpEntry {

	public static void main(String[] args) {

		Session session=Util.getSF().openSession();
		Transaction tr=session.beginTransaction();
		
		
		Emp e1=new Emp();
		e1.setEcode("E111"); e1.setEname("AAA"); e1.setSal(55000);
		e1.getProjects().add(new Project("P111"));
		e1.getProjects().add(new Project("P113"));
		e1.getProjects().add(new Project("P115"));
		session.save(e1);
		
		Emp e2=new Emp();
		e2.setEcode("E112"); e2.setEname("BBB"); e2.setSal(65000);
		e2.getProjects().add(new Project("P112"));
		e2.getProjects().add(new Project("P113"));
		e2.getProjects().add(new Project("P114"));
		session.save(e2);
		tr.commit();
		session.close();
		System.out.println("Data Stored Successfully");
		

	}

}
