package com.hkit.exam.cafe;

import java.util.Scanner;

public class CafeTest {

	public static void main(String[] args) {
		MenuTable mt = new MenuTable();
		
		Customer customer = new Customer();		
		
		MenuItem selectedMenu = customer.chooseMenu(mt);
		/*
		mt.showMenus();
		int idx = customer.chooseMenu();
		MenuItem selectedMenu = mt.pickMenuItem(idx);
		*/
		System.out.println(selectedMenu);
	}

}
