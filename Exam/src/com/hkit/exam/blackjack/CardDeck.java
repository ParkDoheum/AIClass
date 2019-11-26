package com.hkit.exam.blackjack;

public class CardDeck {
	private Card[] cards = new Card[52];
		
	//기본 생성자!!!
	public CardDeck() {
		init();
	}
	
	private void init() {
		String[] shapes = {"스페이드", "하트", "클로버", "다이아몬드"};
		/*
		String[] shapes = new String[4];
		shapes[0] = "스페이드";
		shapes[1] = "하트";
		shapes[2] = "클로버";
		shapes[3] = "다이아몬드";		
		String spade = shapes[0];
		*/
		int cardsIdx = 0;
		for(int i=0; i<shapes.length; i++) {
			for(int z=1; z<=13; z++) {
				cards[cardsIdx++] = new Card(z, shapes[i]);
			}
		}
		
	}
	
	public void showCards() {
		/*
		for(Card c : cards) {
			System.out.println(c);
		}
		*/
		for(int i=0; i<cards.length; i++) {
			Card c = cards[i];
			if(c != null) {
				c.showMe();
			}			
		}
	}
	
	
	public Card pick() {
		Card c = null;
		for(int i=0; i<cards.length; i++) {
			if(cards[i] != null) {
				c = cards[i];
				cards[i] = null;
				break;
			}
		}
		return c;
	}
	
	public Card pickRandom() {
		Card c = null;
		while(c == null) {
			int r = (int)(Math.random() * cards.length);
			if(cards[r] != null) {
				c = cards[r];
				cards[r] = null;
				break;
			}
		}		
		return c;
	}
	
	
	public void shuffle() {
		for(int i=0; i<cards.length; i++) {
			int r = (int)(Math.random() * cards.length);			
			Card temp = cards[i];
			cards[i] = cards[r];
			cards[r] = temp;
		}
	}
	
}
















