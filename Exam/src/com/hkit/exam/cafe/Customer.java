package com.hkit.exam.cafe;

import java.util.Scanner;

public class Customer {
	Scanner scan = new Scanner(System.in);
	
	public int chooseMenu() {		
		System.out.print("메뉴를 선택해 주세요 : ");
		int idx = scan.nextInt();		
		return idx;
	}
	
	public MenuItem chooseMenu(MenuTable mt) {
		mt.showMenus();
		System.out.print("메뉴를 선택해 주세요 : ");
		int idx = scan.nextInt();
		return mt.pickMenuItem(idx);
	}
	
	public void drink(Coffee coffe) {
		System.out.printf("%s을(를) 마신다.", coffe.getNm());
	}
}
