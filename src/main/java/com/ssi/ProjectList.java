package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class ProjectList {
	public static void main(String args[]) {

		Session session = Util.getSF().openSession();
		Criteria criteria = session.createCriteria(Project.class);
		List<Project> projects = criteria.list();

		for (Project project : projects) {
			System.out.println("PCode  : " + project.getPcode());
			System.out.println("Title  : " + project.getPtitle());
			System.out.println("PrDur  : " + project.getDuration());
			System.out.println("Employees Working On It : ");
			List<Emp> emps=project.getEmps();
			for(Emp emp:emps){
				System.out.println(emp.getEcode()+","+emp.getEname());
			}
			System.out.println("______________________________________________");
		}

	}
}
