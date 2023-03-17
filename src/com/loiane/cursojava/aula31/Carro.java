package com.loiane.cursojava.aula31;

 public class Carro {

	 public String marca;
	String modelo;
	int numPassageiro;
	private double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonima do carro é: " + this.capCombustivel * this.consumoCombustivel);
	}
}

