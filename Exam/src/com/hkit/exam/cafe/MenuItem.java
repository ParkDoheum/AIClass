package com.hkit.exam.cafe;

public class MenuItem {
	private final String nm;
	private final int price;
	
	public MenuItem(String nm, int price) {
		this.nm = nm;
		this.price = price;
	}

	public String getNm() {
		return nm;
	}
	
	public int getPrice() {
		return price;
	}
}
