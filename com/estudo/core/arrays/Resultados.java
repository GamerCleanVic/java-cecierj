package com.estudo.core.arrays;

public class Resultados {
	private boolean[] resultados = {true, false, false, true};
	
	public boolean imprimeResultado() {
		for(int i = 0; i < resultados.length; i++) {
			System.out.println("resultado["+i+"] = "+resultados[i]);
		}
		return false;
	}
}
