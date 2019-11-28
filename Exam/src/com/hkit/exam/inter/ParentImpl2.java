package com.hkit.exam.inter;

public class ParentImpl2 implements Parent, Super {
	@Override
	public void print(int sum) {
		System.out.println("합계 : " + sum);		
	}
	
	@Override
	public int sum(int n1, int n2) {
		if(n1 > n2) {
			return n1 + n1;
		} else {
			return n2 + n2;
		}
	}
	
	@Override
	public void flying() {
		System.out.println("I believe I can fly!!!");		
	}

}
