package com.hkit.exam.blackjack;

public class CardDeck {
	private Card[] cards = new Card[52];
	
	
	//기본 생성자!!!
	public CardDeck() {
		init();
	}
	
	private void init() {
		String[] shapes = {"스페이드", "하트", "클로버", "다이아몬드"};
		int cardsIdx = 0;
		for(int i=0; i<shapes.length; i++) {
			for(int z=1; z<=13; z++) {
				cards[cardsIdx++] = new Card(z, shapes[i]);
			}
		}	
	}
	
	public void showCards() {
		for(Card c : cards) {
			System.out.println(c);
		}
	}
}
