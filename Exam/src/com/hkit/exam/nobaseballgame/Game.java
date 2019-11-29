package com.hkit.exam.nobaseballgame;

import java.util.Scanner;

public class Game {
	private int[] rArray;
	private int[] myArray;
	
	public Game(int len) {
		rArray = new int[len];
		myArray = new int[len];
	}
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		setRandoms2();
		
		System.out.println("랜덤값");
		for(int i : rArray) {
			System.out.print(i + ",");
		}
		System.out.println();
		
		
		System.out.println("숫자를 입려해주세요.");
		for(int i=0; i<myArray.length; i++) {
			System.out.printf("숫자 %d : ", (i+1));
			myArray[i] = scan.nextInt();
		}		
		check();
		
		scan.close();
		
		
	}
	
	//SBO 확인용 (true: 게임지속, false: 게임종료)
	public boolean check() {
		int s = 0, b = 0;
		int len = rArray.length;
		for(int i=0; i<len; i++) {
			for(int z=0; z<len; z++) {
				if(rArray[i] == myArray[z]) {
					if(i==z) {
						s++;
					}else {
						b++;
					}
					break;
				}
			}
		}		
		System.out.printf("S:%d  B:%d  O:%d\n", s, b, (len - (s + b)));
		if(len == s) {
			return false;
		}
		return true;
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











