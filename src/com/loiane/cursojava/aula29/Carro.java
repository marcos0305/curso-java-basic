package com.loiane.cursojava.aula29;

public class Carro {
	String marca;
	String modelo;
	int numPassageiro;
	double capCombustivel;
	double consumoCombustivel;
	
	
	// constrrutores

	Carro(){
		System.out.println("A calse carro foi iinstanciada");
		numPassageiro = 4; 
	
		}
	Carro(String marca_,String modelo_,int numPassageiro_,double capCombustivel_,double consumoCombustivel_){
		marca = marca_;
		modelo = modelo_;
		numPassageiro = numPassageiro_;
		numPassageiro = numPassageiro_;
		consumoCombustivel = consumoCombustivel_;
	}
	}


