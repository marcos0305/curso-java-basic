package com.loiane.cursojava.aula30;

public class Carro {

	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	
	public Carro(String marca, String modelo, int numPassageiro, double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiro = numPassageiro;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() {
		
		
}

	public Carro(String marca, String modelo, int numPassageiro) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiro = numPassageiro;
			System.out.println("Chamado o construdor com 3 parametros");

	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 5);
			System.out.println("Chamado o construdor com 2 parametros");
	}
}