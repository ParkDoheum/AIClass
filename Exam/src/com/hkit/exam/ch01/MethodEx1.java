package com.hkit.exam.ch01;

public class MethodEx1 {
	
	static int age = 10;
	
	public static void main(String[] args) {
		int n1 = 10;
		int hap = sum(n1, 30);		
		System.out.println(hap);
		
		sum2(30, 11);
		
		
		int minus = minus(40, 30);
		System.out.println(minus);
		
		minus2(50, 30);
		
		ddd();
	}
	
	
	public static void ddd() {
		System.out.println("age : " + age);
	}
	
	
	public static void minus2(int n1, int n2) {
		System.out.println(n1 - n2);
	}
	
	
	public static int minus(int n1, int n2) {
		return n1 - n2;
	}
	
	public static int sum(int a, int b) {
		int result = a + b;
		System.out.println(result);
		return result;
	}
	
	public static void sum2(int a, int b) {
		System.out.println(a + b);
		return;
	}
}


