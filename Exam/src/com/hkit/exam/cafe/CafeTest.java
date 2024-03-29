package com.hkit.exam.cafe;

import java.util.Scanner;

public class CafeTest {

	public static void main(String[] args) {
		MenuTable mt = new MenuTable();		
		Customer customer = new Customer();		
		Barista barista = new Barista();
		MenuItem selectedMenu = customer.chooseMenu(mt);
		if(selectedMenu == null) {
			System.out.println("선택을 잘 못 하셨습니다.");
			return;
		}
		Coffee coffee = barista.makeCoffee(selectedMenu);
		customer.drink(coffee);
		/*
		mt.showMenus();
		int idx = customer.chooseMenu();
		MenuItem selectedMenu = mt.pickMenuItem(idx);
		*/
		//System.out.println(selectedMenu);
	}

}
