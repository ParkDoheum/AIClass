package com.hkit.exam.inter;

public class InterTest {

	public static void main(String[] args) {
		ParentImpl p = new ParentImpl();
		ParentImpl2 p2 = new ParentImpl2();
	
		
		fly("");
		fly(p);
		fly(p2);
	}
	
	public static void fly(Object o) {
		if(o instanceof Super) {
			Super s = (Super)o;
			s.flying();
		} else {
			System.out.println("날 수 없습니다.");
		}
	}
	
	public static void show(Parent p, int a, int b) {
		int sum = p.sum(a, b);
		p.print(sum);
		
		if(p instanceof Super) {
			Super s = (Super)p;
			s.flying();
		}
	}

}
