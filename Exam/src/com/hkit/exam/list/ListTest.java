package com.hkit.exam.list;

import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> list = new LinkedList();
		list.add("안녕");
		list.add("하세요");
		list.add("ㅋㅋㅋㅋㅋ");
		
		String s3 = list.get(1);
		System.out.println(s3);
		
		list.remove(1);

		s3 = list.get(1);
		System.out.println(s3);
	}
}
