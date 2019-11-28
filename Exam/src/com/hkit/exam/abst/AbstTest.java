package com.hkit.exam.abst;

public class AbstTest {
	public static void main(String[] args) {
		Parent p = new Child("홍길동");		
		p.goToPicnic();
		
		Child c = (Child)p;
		c.sleep();
	}
}
