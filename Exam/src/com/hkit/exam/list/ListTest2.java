package com.hkit.exam.list;

public class ListTest2 {
	public static void main(String[] args) {
		CustomList list = new CustomList();
		
		list.add(5);
		list.add(7);
		list.add(2);
		list.add(10);
		list.add(1);
		list.add(5);
		
		list.sort();
		
		list.show();
	}
}
