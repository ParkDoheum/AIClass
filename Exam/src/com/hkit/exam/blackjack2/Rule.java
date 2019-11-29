package com.hkit.exam.blackjack2;

public class Rule {
	public static void whoIsWin(Gamer g1, Gamer g2) {
		int g1Sum = g1.myCardNoSum();
		int g2Sum = g2.myCardNoSum();
		
		String winNm = null;
		if(g1Sum == g2Sum || (g1Sum > 21 && g2Sum > 21)) {
			System.out.println("비겻습니다.");			
		} else {
			if(g1Sum > 21) {
				winNm = g2.NAME;
			} else if(g2Sum > 21){
				winNm = g1.NAME;
			} else {
				if(g1Sum > g2Sum) {
					winNm = g1.NAME;	
				} else {
					winNm = g2.NAME;
				}
			}
			System.out.println();
			System.out.printf("%s가 이겼습니다\n", winNm);
		}	
		g1.openCards();
		g2.openCards();
	}
}








