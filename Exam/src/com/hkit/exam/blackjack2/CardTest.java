package com.hkit.exam.blackjack2;

public class CardTest {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Gamer gamer = new Gamer("Gamer");
		Dealer dealer = new Dealer("Dealer");
		
		for(int i=0; i<2; i++) {
			dealer.receiveCard(cd.pick());
			gamer.receiveCard(cd.pick());	
		}		
		dealer.moreCard(cd);
		
		gamer.openCards();
		dealer.openCards();
	}

}
