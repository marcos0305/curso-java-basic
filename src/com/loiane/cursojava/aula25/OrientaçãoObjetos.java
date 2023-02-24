package com.loiane.cursojava.aula25;

public class OrientaçãoObjetos{
	String modelo;
	String marca;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	
	// Método sem retorno
	
	void exibirAutonomia(){
		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel +  " km");				
	}
	
	// Método Com retorno
	
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado");
		
		return capCombustivel * consumoCombustivel;		
	}
	
	//Método com parâmetro
	
	double calcularCombustivel(double km) {
		double qtdCombustivel =  km/consumoCombustivel;
	return qtdCombustivel;
	
	
	}
}
 