package com.estudo.core.arrays;

import java.text.DecimalFormat;

public class Notas {
	private double []notas = {8.0, 9.5, 6.7, 8.4, 2.95};	

	public double statusAluno() {
		double soma = 0;
		for(int i = 0; i < notas.length; i++) {
			soma += notas[i];			
		}
		double media = soma /= notas.length;
		DecimalFormat df = new DecimalFormat("#.##");
		String mediaFormatada = df.format(media);
		
		System.out.println("Média do aluno: "+(mediaFormatada));
		if(media >= 7) {
			System.out.println("Aluno aprovado!");
		}else {
			System.out.println("Aluno reprovado!");
		}
		return 0;
	}
}
