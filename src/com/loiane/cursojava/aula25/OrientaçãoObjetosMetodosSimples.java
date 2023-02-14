package com.loiane.cursojava.aula25;

public class OrientaçãoObjetosMetodosSimples {
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel +  " km");
		
	}
}
