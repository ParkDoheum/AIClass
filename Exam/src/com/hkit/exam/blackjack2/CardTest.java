package com.hkit.exam.blackjack2;

import java.util.Scanner;

public class CardTest {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Gamer gamer = new Gamer("Gamer");
		Dealer dealer = new Dealer("Dealer");
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			dealer.receiveCard(cd.pick());
			gamer.receiveCard(cd.pick());	
		}		
		dealer.moreCard(cd);		
		
		String answer;
		while(true) {
			gamer.openCards();
			System.out.print("카드를 더 받으시겠습니까? (y, n) : ");
			answer = scan.next();
			
			if(answer.equals("n")) {
				break;
			}
			gamer.receiveCard(cd.pick());
		}
		scan.close();
		
		Rule.whoIsWin(gamer, dealer);
	}
}






