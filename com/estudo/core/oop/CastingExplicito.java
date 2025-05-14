package com.estudo.core.oop;

public class CastingExplicito {
	private double numDouble2 = 45.32;
	public int castingExplicito() {
		int numInt2 = (int)numDouble2;
		System.out.println("double numDouble2 = "+numDouble2+
				"\nnumInt2 = (int)numDouble2: "+numInt2);
		return 0;
	}
}