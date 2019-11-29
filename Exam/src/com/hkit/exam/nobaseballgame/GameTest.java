package com.hkit.exam.nobaseballgame;

public class GameTest {
	public static void main(String[] args) {
		int len = 3;
			
		if(args.length > 0) {
			len = Utils.paseNumber(args[0], len);
		}			
				
		Game game = new Game(len);
		game.start();
	}
}
