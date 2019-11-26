package com.hkit.exam.inhe;

public class MiniSamsungTv extends SamsungTV {
	@Override
	public void whoAmI() {
		System.out.println("MiniSamsungTv 입니다.");
	}
	
	@Override
	public void splash() {
		System.out.println("Twinkle Twinkle");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Mini Tv Off");
	}
}
