package com.hkit.exam.nobaseballgame;

public class GameTest {
	public static void main(String[] args) {
		int len = 3;
		
		if(args[0] != null) {
			len = Utils.paseNumber(args[0], len);
		}		
		
		System.out.println("len : " + len);
		
		//Game game = new Game(len);

	}
}
