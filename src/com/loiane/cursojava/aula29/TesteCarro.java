package com.loiane.cursojava.aula29;

public class TesteCarro {

	public static void main(String[] args) {
		 
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiro = 10;
		van.capCombustivel = 120;
		van.consumoCombustivel = 10;
 
		System.out.println(van.numPassageiro);
		
		
		Carro van2 = new Carro("Fiat","Ducato", 10, 100, 0.2 );				
		
		System.out.println(van2.marca);
		System.out.println(van2.modelo);
		System.out.println(van2.numPassageiro);
		System.out.println(van2.capCombustivel);
		System.out.println(van2.consumoCombustivel);

		
	} 

}
