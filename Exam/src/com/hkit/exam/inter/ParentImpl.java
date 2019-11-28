package com.hkit.exam.inter;

public class ParentImpl implements Parent {

	@Override
	public void print(int sum) {
		System.out.println("sum : " + sum);
	}

	@Override
	public int sum(int n1, int n2) {
		return n1 + n2;
	}

}
