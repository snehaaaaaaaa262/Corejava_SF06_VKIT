package com.tnsif.accessmodifierdemo;

public class Accessdemo {
	int a=9;
	String s="guru";
	
	public void display() {
		System.out.println("welcome to java");
	}
	
	public static void main(String[] args) {
		Accessdemo obj=new Accessdemo();
		System.out.println(obj.a);
		System.out.println(obj.s);
		
		obj.display();
	}
}
