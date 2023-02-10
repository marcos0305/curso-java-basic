package com.loiane.cursojava.aula24.labs;

public class Exer06 {

	public static void main (String[] args) {
		
		Contato contato1 = new Contato();
		
		contato1.nome = "Luke";
		contato1.endereço = "Ponte alta norte";
		contato1.email = "LukeSkywalker@gmail.com";
		
		
		contato1.telefones = new String[2];
		contato1.telefones [0] = "99999-9999";
		contato1.telefones [1] = "99999-9999";
		
		
		System.out.println("Nome: " + contato1.nome);
		System.out.println("Endereço: "  + contato1.endereço);
		System.out.println("Email: " + contato1.email);
		
	}
	
}
