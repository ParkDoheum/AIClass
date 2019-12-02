package com.hkit.exam.cafe;

public class Barista {
	public Coffee makeCoffee(MenuItem mi) {		
		return new Coffee(mi);
	}
}
