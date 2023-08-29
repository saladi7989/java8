package com.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUppercase {

	public static void main(String[] args) {
		
		List<String> cuntrys = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "India","Canada");
		
		String Country = cuntrys.stream().map(x ->x.toUpperCase()).collect(Collectors.joining(","));
		
		System.out.println(Country);

	                                                                   
	}

}
