package com.hkit.exam.blackjack2;

public class CardTest {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Gamer gamer = new Gamer("Gamer");
		
		for(int i=0; i<2; i++) {
			gamer.receiveCard(cd.pick());
		}
		
		gamer.openCards();
		System.out.println("-----------");
		cd.showCards();
	}

}
