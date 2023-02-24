package com.loiane.cursojava.aula25;

public class OrientaçãoObjetosTeste {

	public static void main(String[] args) {
		
		
		//Metodo sem retorno 
		OrientaçãoObjetos carro = new OrientaçãoObjetos();
		carro.marca = "Fiat";
		carro.modelo = "Ducato";
		carro.numPassageiro = 10;
		carro.capCombustivel = 100;
		carro.consumoCombustivel = 0.2;
		
		System.out.println(carro.marca);
		System.out.println(carro.modelo);

		carro.exibirAutonomia();
		
		//Metodo com retorno 
		double autonomia = carro.obterAutonomia();
		
		System.out.println("A autonomia do carro é: " + autonomia );
		System.out.println("A autonomia do carro é: " + carro.obterAutonomia());		
		
		
		//Metodo de parametros
		double qtdCombustivel10 = carro.calcularCombustivel(10);
		double qtdCombustivel15 = carro.calcularCombustivel(15);
		
		System.out.println("Quantidade de combustivel(10) = " + qtdCombustivel10);
		System.out.println("Quantidade de combustivel(15) = " + qtdCombustivel15);

	}
	
}
