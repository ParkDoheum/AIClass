package com.hkit.exam.poly;

public class ObjectTest {
	public static void main(String[] args) {
		/*
		ObjectA a = new ObjectA();
		a.printA();
		
		a = new ObjectB();
		a.printA();
		ObjectB b = (ObjectB)a;
		b.printB();
				
		a = new ObjectC();
		a.printA();
		ObjectC c = (ObjectC)a;
		ObjectB b2 = (ObjectB)a;
		b2.printB();
		
		c.printB();
		c.printC();
		 */		
		
	
		print(new ObjectA());
		print(new ObjectB());
		print(new ObjectC());		
	}
	public static void print(ObjectA obj) {
		if(obj instanceof ObjectC) {
			ObjectC c = (ObjectC)obj;
			c.printC();
			return;
		}
		obj.printA();
	}
}


