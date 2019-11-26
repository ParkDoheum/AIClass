package com.hkit.exam.inhe;

public class TvTest6 {
	public static void main(String[] args) {		
		SamsungTV sTV = new SamsungTV();		
		MiniSamsungTv msTV = new MiniSamsungTv();
		LGTv lTv = new LGTv();
	
		printWhoAmI(sTV);
		printWhoAmI(msTV);
		printWhoAmI(lTv);		
	}
	
	public static void printWhoAmI(Tv sTV) {
		sTV.whoAmI();
	}

	
	
	
	
	
	
	
}




