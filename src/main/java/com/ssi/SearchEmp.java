package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchEmp {

	public static void main(String[] args) {

		Session session = Util.getSF().openSession();
		Emp emp = session.get(Emp.class, "E111");

		System.out.println(emp.getEcode());
		System.out.println(emp.getEname());
		System.out.println(emp.getSal());
		System.out.println("_____________________");

		List<Laptop> laptopList = emp.getLaptops();

		System.out.println("Laptop-Details : ");
		System.out.println("_____________________");
		for (Laptop laptop : laptopList) {
			System.out.println(laptop);
		}

		System.out.println("Projects Details : ");

		List<Project> projects = emp.getProjects();
		
		for(Project project:projects){
			System.out.println(project);
		}
		
		

		session.close();

	}

}
