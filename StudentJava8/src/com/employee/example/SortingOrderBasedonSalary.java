package com.employee.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOrderBasedonSalary {

	public static void main(String[] args) {
		List<Employee> li=new ArrayList();
		
		Employee em=new Employee();
		em.setEid(1);
		em.setEname("sreenu");
		em.setSalary(50000);
		
		Employee em1=new Employee();
		em1.setEid(2);
		em1.setEname("sreenu m");
		em1.setSalary(23000);
		
		Employee em2=new Employee();
		em2.setEid(3);
		em2.setEname("sreenu b");
		em2.setSalary(87000);
		
		Employee em3=new Employee();
		em3.setEid(4);
		em3.setEname("bhanu");
		em3.setSalary(10000);
		
		Employee em4=new Employee();
		em4.setEid(5);
		em4.setEname("mahesh");
		em4.setSalary(16000);
		
		Employee em5=new Employee();
		em5.setEid(6);
		em5.setEname("brahma");
		em5.setSalary(90000);
		
		li.add(em);
		li.add(em1);
		li.add(em2);
		li.add(em3);
		li.add(em4);
		li.add(em5);
		
		List<Employee> list=li.stream().sorted(( Employee e1,Employee e2)->(e1.getSalary()-e2.getSalary()))
				.collect(Collectors.toList());
				System.out.println(list);
				
				
				
				
	}

}
