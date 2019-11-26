package com.hkit.exam.inhe;
/*
 부모타입 자기 자신의 객체 포함
자식의 객체 주소 값을 
가질 수 있다.

 */
public class TvTest2 {
	public static void main(String[] args) {
		
		Tv tv1 = new Tv(); //A
		tv1.whoAmI();
		
		Tv tv2 = new SamsungTV(); //B
		tv2.whoAmI();
		
		Tv tv3 = new MiniSamsungTv(); //C
		Tv tv4 = new LGTv();
		
		SamsungTV sTv = new MiniSamsungTv();		
	}
}
