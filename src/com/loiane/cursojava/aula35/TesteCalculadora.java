package com.loiane.cursojava.aula35;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		int FatorialRN = Calculadora.fatorialNaoRecursivo(5);
			System.out.println(FatorialRN);
			
		int FatorialR = Calculadora.fatorial(5);
			System.out.println(FatorialR);
	}
	
}
