package com.estudo.core.oop;

public class ComparaString {
	private String frase1;
	private String frase2;	
	
	public String comparaString() {
		String frase1 = this.frase1;
		String frase2 = this.frase2;
		
		frase1 = new String("Testando igualdade!");
		frase2 = new String("Testando igualdade!");
		
		System.out.println("Frase 1: "+frase1);
		System.out.println("Frase 2: "+frase2);
		System.out.println("Frase 1 e Frase 2 são iguais (usando == )? "+(frase1 == frase2));
		System.out.println("Frase 1 e Frase 2 são iguais (usando equals())? "+frase1.equals(frase2));
		return null;
	}
}