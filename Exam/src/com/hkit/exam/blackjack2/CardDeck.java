package com.hkit.exam.blackjack2;

import java.util.LinkedList;
import java.util.List;

public class CardDeck {
	private List<Card> list = new LinkedList();
	
	public CardDeck() {
		String[] shapes = {"Spade", "Heart", "Clover", "Diamond"};		
		for(int i=0; i<shapes.length; i++) {
			for(int z=1; z<=13; z++) {
				Card c = new Card(shapes[i], z);
				list.add(c);
				
				//list.add(new Card(shapes[i], z));
			}
		}
	}
	
	public void showCards() {
		for(Card c : list) {
			System.out.println(c);
		}
	}
}







