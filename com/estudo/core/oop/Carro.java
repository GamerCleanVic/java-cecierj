package com.estudo.core.oop;

public class Carro {
	private String marca;
	private String modelo;
	private String cor;
	private String combustivel;
	
	public String caracteristicasCarro(String marca, String modelo,
			String cor, String combustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.combustivel = combustivel;
		System.out.println("Marca: "+this.marca+
				"\nModelo: "+this.modelo+
				"\nCor: "+this.cor+
				"\nCombustível: "+this.combustivel);
		return "";
	}
	
	public void ligar() {
		System.out.println("Ligou o carro!");
	}
	public void acelerar() {
		System.out.println("Acelerando o carro!");
	}
	public void frear() {
		System.out.println("Freando o carro!");
	}
}
