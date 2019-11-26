package com.hkit.exam.blackjack;

public class CardTest4 {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();		
		cd.shuffle();
		//cd.showCards();
		Card c = cd.pick();
		System.out.println(c);
		
		System.out.println(cd.pick());
		System.out.println(cd.pick());
		System.out.println(cd.pick());
		System.out.println(cd.pick());

	}

}
