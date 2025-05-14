package com.estudo.core.oop;

public class Casting {
	private int numInteiro = 10;
	private double numDouble;
	
	public int castingInplicito () {
		System.out.println("Casting Implícito\nnumInteiro = 10: "+numInteiro);
		numDouble = numInteiro;
		System.out.println("numDouble = numInteiro: "+numDouble);
		return 0;
	}
}