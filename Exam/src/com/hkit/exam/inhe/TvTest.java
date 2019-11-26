package com.hkit.exam.inhe;

public class TvTest {
	public static void main(String[] args) {		
		System.out.println("-- SamsungTV --");
		SamsungTV sTv = new SamsungTV();
		sTv.turnOn();
		sTv.turnOff();
		sTv.splash();
		
		System.out.println("-- MiniSamsungTV --");
		MiniSamsungTv msTv = new MiniSamsungTv();
		msTv.turnOn();
		msTv.turnOff();
		msTv.splash();
		
		System.out.println("-- LGTv --");
		LGTv lTv = new LGTv();
		lTv.turnOn();
		lTv.turnOff();
		//lTv.splash();
	}
}
