package com.hkit.exam.blackjack;

public class Rule {
	public void whoIsWin(User u1, User u2) {
		//누가 몇 점 이었는지		
		int u1Sum = u1.sumNo();
		System.out.printf("%s의 카드 합계 : %d\n", u1.name, u1Sum);
				
		int u2Sum = u2.sumNo();
		System.out.printf("%s의 카드 합계 : %d\n", u2.name, u2Sum);
		//실제로 누가 이겼는지 vs 비겼는지 결과 값이 나오도록
		
		if(u1Sum == u2Sum) {
			System.out.println("비겼습니다!");
		} else if(u1Sum > u2Sum) {
			System.out.printf("%s가 이겼습니다.", u1.name);
		} else {
			System.out.printf("%s가 이겼습니다.", u2.name);
		}
	}
}
