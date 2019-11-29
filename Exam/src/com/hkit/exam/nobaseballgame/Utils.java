package com.hkit.exam.nobaseballgame;

public class Utils {
	public static int paseNumber(String s, int def) {		
		int result = def;
		try {
			result = Integer.parseInt(s);
		} catch(Exception e) {}		
		return result;
	}
}
