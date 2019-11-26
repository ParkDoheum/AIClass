package com.hkit.exam.blackjack;

public class Card {
	String shape;
	int no; //1~13
	
	public Card() {		
	}
	
	public Card(int no, String shape) {
		
		this.no = no;
		this.shape = shape;
	}
	
	public Card(int no) {
		
		this.no = no;
	}
	
	@Override
	public String toString() {
		return "shape : " + this.shape + ", no : " + this.no;
	}
}








