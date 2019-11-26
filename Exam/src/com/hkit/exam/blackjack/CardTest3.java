package com.hkit.exam.blackjack;

public class CardTest3 {
	public static void main(String[] args) {
		//Math.random() //0~0.9999999999999999999
		
		int r = (int)(Math.random() * 52); //0~51
		System.out.println(r);
		/*
		CardDeck cd = new CardDeck();
		for(int i=0; i<50; i++) {
			cd.pick();
		}		
		cd.showCards();
		*/		
	}
}
