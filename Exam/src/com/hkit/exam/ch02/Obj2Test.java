package com.hkit.exam.ch02;

public class Obj2Test {
	public static void main(String[] args) {
		int jinhoMath = 10;
		changeValue(jinhoMath);
		System.out.println(jinhoMath);

		Student miyoung = new Student();
		miyoung.math = 10;
		changeValue(miyoung);
		System.out.println(miyoung.math);
	}
	//A
	public static void changeValue(int math) {
		math = 50;
	}
	//B
	public static void changeValue(Student s) {
		s.math = 50;
	}
}

class Student{
	int math;
}