package com.hkit.exam.blackjack2;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
	private final String NAME;
	private final List<Card> MY_CARDS = new ArrayList();
	
	public Gamer(String name) {
		this.NAME = name;
	}
	
	public void receiveCard(Card c) {
		MY_CARDS.add(c);
	}
	
	public int myCardNoSum() {
		int sum = 0;
		for(Card c : MY_CARDS) {
			sum = sum + c.intNo;
		}
		return sum;
	}
	
	public void openCards() {
		System.out.printf("------- %s -------\n", NAME);
		for(Card c : MY_CARDS) {
			System.out.println(c);
		}
		System.out.printf("합계 %d\n", myCardNoSum());
	}
}










