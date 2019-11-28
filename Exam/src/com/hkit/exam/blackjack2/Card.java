package com.hkit.exam.blackjack2;

public class Card {
	public final String shape;
	public final String showNo;
	public final int intNo;
	
	public Card(String shape, int intNo) {		
		this.shape = shape;		
				
		if(intNo == 1) {
			this.showNo = "A";			
		} else if(intNo <= 10) {
			this.showNo = Integer.toString(intNo);
		} else {
			if(intNo == 11) {	
				this.showNo = "J";
				
			} else if(intNo == 12) {
				this.showNo = "Q";	
				
			} else if(intNo == 13) {
				this.showNo = "K";
				
			} else {
				this.showNo = "";
			}	
			this.intNo = 10;
			return;
		}
		
		this.intNo = intNo; 
	}
}
