package com.hkit.exam.blackjack2;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
	private String name;
	private List<Card> myCards = new ArrayList();
	
	public Gamer(String name) {
		this.name = name;
	}
	
	public void receiveCard(Card c) {
		myCards.add(c);
	}
	
	public void openCards() {
		System.out.printf("------- %s -------\n", name);
		for(Card c : myCards) {
			System.out.println(c);
		}
	}
}




