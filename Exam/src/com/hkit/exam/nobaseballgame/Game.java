package com.hkit.exam.nobaseballgame;

public class Game {
	private int[] rArray;
	private int[] myArray;
	
	public Game(int len) {
		rArray = new int[len];
		myArray = new int[len];
	}
	
	public void start() {
		setRandoms2();
		
		for(int i : rArray) {
			System.out.println(i);
		}
	}
	
	public void setRandoms2() {
		int len = rArray.length;
		int cnt = 0;
		while(cnt < len) {
			int r = (int)(Math.random() * 9) + 1;
			
			for(int i=0; i<len; i++) {
				if(rArray[i] == 0) {
					rArray[i] = r;
					cnt++;
					break;
				} else if(rArray[i] == r) {
					break;
				}
			}
		}
	}
	
	
	public void setRandoms() { //1~9사이 랜덤값을 중복 금지!
		for(int i=0; i<rArray.length; i++) { //몇 칸이 들어갔는지
			int r = (int)(Math.random() * 9) + 1;
			
			for(int z=0; z<rArray.length; z++) {
				if(rArray[z] == 0) {
					rArray[z] = r;
					break;
				} else if(rArray[z] == r) {
					i--;
					break;
				}				
			}			
		}		
	}
	
}











