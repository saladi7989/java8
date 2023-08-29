package com.java8.examples;

import java.util.Arrays;
import java.util.List;

public class StartsWithA {

	public static void main(String[] args) {
		
		List<String> st=Arrays.asList("anil","sri","abcd","de","arun","bhanu");
		
		long cou=st.stream().filter(x->x.startsWith("a")).count();
		
		System.out.println(cou);
		
	}

}
