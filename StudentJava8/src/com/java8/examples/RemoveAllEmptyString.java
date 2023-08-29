package com.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveAllEmptyString {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		
		List<String> string=str.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
		
		System.out.println(string);
		

	}

}
