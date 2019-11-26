package com.hkit.exam.inhe;

public class TvTest5 {

	public static void main(String[] args) {
		Tv tv = new SamsungTV();
		Tv tv2 = tv;
		tv = new Tv();
		
		SamsungTV sTv = (SamsungTV) tv;
		sTv.whoAmI();

	}

}
