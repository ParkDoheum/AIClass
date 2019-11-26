package com.hkit.exam.inhe;

public class SamsungTV extends Tv{
	@Override
	public void whoAmI() {
		System.out.println("SamsungTV 입니다.");
	}
	
	public void splash() {
		System.out.println("번쩍이다!!");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Samsung Tv Off");
	}
}
