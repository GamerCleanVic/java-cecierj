package com.estudo.core.ooptest;

import com.estudo.core.oop.Carro;

public class CarroTest {
	public static void main (String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		System.out.println("Carro 1");
		carro1.caracteristicasCarro("Ford", "Fiesta", "Branco", "Gasolina");
		System.out.println("\nCarro 2");
		carro2.caracteristicasCarro("Mitsubishi", "L-200", "Azul royal", "Diesel");
	}
}
