package com.hkit.exam.poly;

public class ObjectC extends ObjectB {
	@Override
	public void printA() {
		System.out.println("C가 가지고 있는 printA");
	}
	
	@Override
	public void printB() {
		System.out.println("C가 가지고 있는 printB");
	}
	
	public void printC() {
		System.out.println("C 입니다.");
	}
}
