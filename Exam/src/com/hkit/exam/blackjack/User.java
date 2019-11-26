package com.hkit.exam.blackjack;

public class User {
	private Card[] userCards = new Card[3];
	public final String name;
	
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
	//내가 가진 카드의 no값을 모두 더한 값을 리턴하는 메소드 
	public int sumNo() {
		int sum = 0;
		for(int i=0; i<userCards.length; i++) {
			//sum = sum + userCards[i].no;
			sum += userCards[i].no;
		}
		return sum;
	}
}












