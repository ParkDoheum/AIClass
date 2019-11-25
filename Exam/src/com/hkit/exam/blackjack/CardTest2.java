package com.hkit.exam.blackjack;

public class CardTest2 {

	public static void main(String[] args) {
		String[] shapes = {"스페이드", "하트", "클로버", "다이아몬드"};
		
		//스페이드, 하트, 클로버, 다이아몬드
		Card[] cards = new Card[shapes.length * 13];

		int cardsIdx = 0;
		for(int i=0; i<shapes.length; i++) {
			for(int z=1; z<=13; z++) {
				cards[cardsIdx++] = new Card(z, shapes[i]);
			}
		}		
		
		for(Card c : cards) {
			System.out.println(c);
		}

	}

}
