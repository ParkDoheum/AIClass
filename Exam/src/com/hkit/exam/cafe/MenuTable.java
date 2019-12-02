package com.hkit.exam.cafe;

import java.util.ArrayList;
import java.util.List;

//MenuTable을 객체화 하면!!
//menus에 MenuItem 4개 추가!!

public class MenuTable {
	private List<MenuItem> menus;
	
	public MenuTable() {
		menus = new ArrayList();
		menus.add(new MenuItem("아메리카노", 1500));
		menus.add(new MenuItem("카푸치노", 2000));
		menus.add(new MenuItem("카라멜 마키아또", 2500));
		menus.add(new MenuItem("에스프레소", 2500));
	}
	
	public void showMenus() {
		for(int i=0; i<menus.size(); i++) {
			MenuItem item = menus.get(i);
			System.out.printf("%d. %s", (i+1), item);
		}
	}
	
	public MenuItem pickMenuItem(int idx) {
		idx -= 1;
		
		if(idx < 0 || idx >= menus.size()) {
			return null;
		}
		
		return menus.get(idx);
	}
	
}









