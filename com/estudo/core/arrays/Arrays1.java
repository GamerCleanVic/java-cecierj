package com.estudo.core.arrays;

public class Arrays1 {
	private int[] ages;	
	
	public int arrays1() {
		ages = new int[100];
//		for(int i = 0; i < ages.length; i++) {
//			ages[i] = 1;
//			System.out.println("Age["+i+"] = "+(ages[i]+i));
//		}
		ages[0] = 10;
		System.out.println("Age["+0+"] = "+(ages[0]));
		return 0;
	}
}