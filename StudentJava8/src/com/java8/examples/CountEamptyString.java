package com.java8.examples;

import java.util.Arrays;
import java.util.List;

public class CountEamptyString {

	public static void main(String[] args) {
	
		List<String> couempty = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		
		long count = couempty.stream().filter(x -> x.isEmpty()).count();
		
		System.out.println(count);

		

	}

}
