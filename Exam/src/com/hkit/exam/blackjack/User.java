package com.hkit.exam.blackjack;

public class User {
	private Card[] userCards = new Card[3];
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public void saveCard(Card c) {
		for(int i=0; i<userCards.length; i++) {
			if(userCards[i] == null) {
				userCards[i] = c;
				break;
			}
		}
	}
	
	public void showCards() {
		System.out.printf("------ %s -----\n", this.name);
		for(Card c : userCards) {
			System.out.println(c);
		}
	}
}




