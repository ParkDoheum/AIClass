package com.hkit.exam.cafe;

public class Coffee {
	private final String nm;
	
	public Coffee(MenuItem mi) {
		this.nm = mi.getNm();
	}
	
	public Coffee(String nm) {
		this.nm = nm;
	}
	
	public String getNm() {
		return this.nm;
	}
}
