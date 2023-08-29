package com.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringArrayExample {

	public static void main(String[] args) {
		
		String array[]= {"abc","acb","bca","abb","bcc"};
		
		List<String> list=Arrays.asList(array);
		List<String>li1 =list.stream().filter(x->x.startsWith("a")).collect(Collectors.toList());
		System.out.println(li1);
		System.out.println("=====================");
		List<String> li=list.stream().filter(x->x.startsWith("ab")).collect(Collectors.toList());
		System.out.println(li);
		List<String> lis=list.stream().filter(x->x.contains("bb")).collect(Collectors.toList());
		System.out.println(lis);
		
		

	}

}
