package com.estudo.core.ooptest;

import com.estudo.core.oop.RegistraAluno;

public class RegistraAlunoTest {
	public static void main (String[] args) {
		RegistraAluno ana = new RegistraAluno();
		RegistraAluno beto = new RegistraAluno();
		RegistraAluno carlos = new RegistraAluno();
		
		ana.setNome("Ana Machado");
		beto.setNome("Roberto da Silva");
		carlos.setNome("Carlos Alberto");
		
		int contador = RegistraAluno.getQuantidadeDeAlunos(); 
		
		System.out.println("Nome: "+ana.getNome());
		System.out.println("Contador: "+(contador));
		System.out.println("Nome: "+beto.getNome());
		System.out.println("Contador: "+(contador));
	}
}
