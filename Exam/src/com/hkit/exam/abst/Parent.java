package com.hkit.exam.abst;

public abstract class Parent {
	private String name;
	
	public Parent(String name) {		
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() > 5) {
			return;
		}
		this.name = name;
	}
	
	abstract public void care();
	
	public void goToPicnic() {
		System.out.printf("%s는 소풍간다!!\n", name);
	}
}





