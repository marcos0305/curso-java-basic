package com.loiane.cursojava.aula35;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		int FatorialNR = Calculadora.fatorialNaoRecursivo(5);
			System.out.println(FatorialNR);
			
			
		int FatorialR = Calculadora.fatorial(5);
			System.out.println(FatorialR);
	}
	
}
