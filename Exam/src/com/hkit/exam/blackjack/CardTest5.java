package com.hkit.exam.blackjack;

public class CardTest5 {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		cd.shuffle();
		
		User dealer = new User("딜러");
		User gamer = new User("게이머");
		
		for(int i=0; i<3; i++) {
			dealer.saveCard(cd.pick());
			gamer.saveCard(cd.pick());
		}		
		dealer.showCards();
		gamer.showCards();
		
		Rule rule = new Rule();
		rule.whoIsWin(dealer, gamer);

	}

}





