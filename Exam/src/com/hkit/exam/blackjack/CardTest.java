package com.hkit.exam.blackjack;

public class CardTest {

	public static void main(String[] args) {		
		Card c1 = new Card();
		c1.no = 1;
		c1.shape = "Spade";
		
		Card c2 = new Card(10, "Heart");
		
		Card c3 = new Card(11);
		c3.shape = "Diamond";
		
		
		System.out.println(c3.no);
	}

}
