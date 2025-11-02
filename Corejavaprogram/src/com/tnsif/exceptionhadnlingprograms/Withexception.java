package com.tnsif.exceptionhadnlingprograms;

public class Withexception {
	public static void main(String[] args) {
		System.out.println("java");
		int d = 0;
		System.out.println("welcome");
		
		try {
		int a = 55/0;
		}
		catch(Exception e) {
			System.out.println("caught"+e);
		}
		System.out.println("hello");
	}
}