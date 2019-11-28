package com.hkit.exam.abst;

public class Child extends Parent {
	public Child(String name) {
		super(name);
	}

	@Override
	public void care() {
		System.out.println(getName() + "는 치료를 당한다.");
	}
	
	public void sleep() {
		System.out.println(getName() + "은 잔다.");
	}
}
