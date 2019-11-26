package com.hkit.exam.blackjack;

public class CardTest4 {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();		
		//cd.shuffle();
		cd.showCards();
		System.out.println(cd.pickRandom());
		System.out.println(cd.pickRandom());
		System.out.println(cd.pickRandom());
		System.out.println(cd.pickRandom());
		System.out.println(cd.pickRandom());

	}

}
