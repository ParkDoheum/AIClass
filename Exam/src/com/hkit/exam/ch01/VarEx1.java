package com.hkit.exam.ch01;

public class VarEx1 {
	public static void main(String[] args) {
		//일반변수 (타입명이 소문자로 시작, 실제 그 값이 저장된다)
		byte b1 = 10;
		short s1 = 20;
		int i1 = 100; //32bit(4byte), 64bit(8byte)  8bit > 1byte
		long l1 = 1000;
		
		float f1 = 11.1f;
		double d1 = 111.12;
		
		char c1 = 'a';		
		boolean bl1 = false;
		
		System.out.printf("b1 : %d\n", b1);
		System.out.printf("f1 : %f\n", f1);
		System.out.printf("d1 : %f\n", d1);
		System.out.printf("c1 : %c\n", c1);
		System.out.printf("c1(int) : %d\n", (int)c1);
		System.out.printf("97 : %c\n", (char)99);
		
	}
}
