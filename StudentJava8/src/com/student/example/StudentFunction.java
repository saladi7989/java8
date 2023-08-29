package com.student.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentFunction {

	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<>();
		
		Student st1=new Student();
		st1.setId(10);
		st1.setName("sreenu");
		st1.setMarks(65);
		st1.setEmail("sreenu@gmail.com");
		
		Student st2=new Student();
		st2.setId(11);
		st2.setName("sreenu betham");
		st2.setMarks(60);
		st2.setEmail("sreenu b@gmail.com");
		
		Student st3=new Student();
		st3.setId(12);
		st3.setName("sreenu mekala");
		st3.setMarks(40);
		st3.setEmail("sreenu m@gmail.com");
		
		Student st4=new Student();
		st4.setId(13);
		st4.setName("mahesh");
		st4.setMarks(30);
		st4.setEmail("mahesh@gmail.com");
		
		Student st5=new Student();
		st5.setId(14);
		st5.setName("brahma");
		st5.setMarks(80);
		st5.setEmail("brahma@gmail.com");

		Student st6=new Student();
		st6.setId(15);
		st6.setName("vasu");
		st6.setMarks(50);
		st6.setEmail("vasu@gmail.com");
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		list.add(st6);
		
	
	
	Predicate<Student> p=s->s.getMarks()>50;
	List<Student>s2=list.stream().filter(p).collect(Collectors.toList());
	for(Student s:s2) {
		System.out.println(s.getName());
		System.out.println(s.getMarks());
	}
		Function<Student, String> f=stulist->stulist.getName();
		
	}
}
