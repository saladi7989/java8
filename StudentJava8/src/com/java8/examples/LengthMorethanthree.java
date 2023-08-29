package com.java8.examples;

import java.util.Arrays;
import java.util.List;

public class LengthMorethanthree {

	public static void main(String[] args) {
		
	List<String> st=Arrays.asList("sreenu","sri","abcd","de","brahma","bhanu");
		
		long num=st.stream().filter(x->x.length()>3).count();
		
		System.out.println(num);
		
		

	}

}
