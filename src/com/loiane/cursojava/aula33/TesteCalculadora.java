package com.loiane.cursojava.aula33;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		
		calc.soma(35 , 36);
		calc.soma(2.0, 5.0);
		
		System.out.println("mostrar na tela: " + calc.soma(2.3, 2.5));


	}

}
