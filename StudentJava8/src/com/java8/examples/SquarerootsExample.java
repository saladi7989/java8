package com.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquarerootsExample {

	public static void main(String[] args) {
		
		List<Integer> num=Arrays.asList(9,10,3,4,7,3,4);
		
		List<Integer> squ=num.stream().map(x->x*x).collect(Collectors.toList());
		
		System.out.println(squ);

	}

}
