package com.hkit.exam.blackjack2;

public class Dealer extends Gamer {
	public Dealer(String name) {
		super(name);		
	}
	
	public void moreCard(CardDeck cd) {
		int sum = myCardNoSum();
		if(sum <= 16) {
			receiveCard(cd.pick());
		}
	}
}
