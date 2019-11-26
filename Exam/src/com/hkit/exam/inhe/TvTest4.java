package com.hkit.exam.inhe;

public class TvTest4 {
	public static void main(String[] args) {
		SamsungTV stv = new SamsungTV(); //A
		Tv tv = stv;		
		SamsungTV stv2 = (SamsungTV)tv;
		stv2.whoAmI();
	}

}
