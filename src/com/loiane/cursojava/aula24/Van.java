package com.loiane.cursojava.aula24;

public class Van {

	public static void main(String [] args) {
		
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiro = 10;
		van.capCombustivel = 120;
		van.consumoCombustivel = 10;
		
		System.out.println("Marca do carro = " + van.marca);
		System.out.println("Modelo do carro = " + van.modelo);
		System.out.println("Capacidade de combustivel = " + van.capCombustivel);
		System.out.println("Consumo de combustivel = " + van.consumoCombustivel);

	}
	
	
}
