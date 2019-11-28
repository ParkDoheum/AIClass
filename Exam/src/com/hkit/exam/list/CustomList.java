package com.hkit.exam.list;

public class CustomList {
	private int[] array;
	
	public void sort() {
		for(int i=0; i<array.length - 1; i++) {			
			for(int z=i+1; z<array.length; z++) {				
				if(array[i] > array[z]) {
					int temp = array[i];
					array[i] = array[z];
					array[z] = temp;
				}
			}			
		}
	}
	
	public void add(int idx, int value) {
		if(idx > array.length) {
			return;
		}		
		int len = array.length;
		int[] temp = new int[len + 1];		
		for(int i=0; i<temp.length; i++) {
			if(i < idx) {
				temp[i] = array[i];
			} else if(i == idx) {
				temp[i] = value;			
			} else {
				temp[i] = array[i - 1];
			}
		}
		array = temp;
	}
	
	public void add(int value) {
		if(array == null) {
			array = new int[1];
			array[0] = value;
		} else {
			int len = array.length;
			
			int[] temp = new int[len + 1];
			for(int i=0; i<len; i++) {
				temp[i] = array[i];
			}
			temp[len] = value;
			array = temp;
		}
	}
	
	public void remove(int idx) {
		int len = array.length;
		if(idx > len - 1 || idx < 0) {
			return;
		} 		
		int[] temp = new int[len - 1];
		int add = 0;
		for(int i=0; i<temp.length; i++) {
			if(idx == i) {
				add = 1;
			}
			temp[i] = array[i + add];
		}
		array = temp;	
	}
	
	public int get(int idx) {
		return array[idx];
	}
	
	//점검용!!
	public void show() {
		for(int i : array) {
			System.out.println(i);
		}
	}
}
