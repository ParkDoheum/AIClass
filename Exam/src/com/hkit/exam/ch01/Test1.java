package com.hkit.exam.ch01;

public class Test1 {
	public static void main(String[] args) {
		Star a = new Star();
		//a.printStar(5);
		//a.printStar(3);
		//a.printStarRect(5);
		//a.printStarRect(3);
		a.printStarTriangleReverse(5);
		
	}	
}

class Star {	
	public void printStarTriangleReverse(int cnt) {
		for(int z=cnt-1; z>=0; z--) {
			for(int i=0; i<cnt; i++) {
				if(i<z) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void printStarTriangle(int cnt) {
		for(int z=1; z<=cnt; z++) {
			for(int i=0; i<z; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void printStarRect(int cnt) {
		for(int z=0; z<cnt; z++) {
			for(int i=0; i<cnt; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void printStar(int cnt) {
		for(int i=0; i<cnt; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}








