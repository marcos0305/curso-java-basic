package com.loiane.cursojava.aula24.labs;

public class Exer05 {
  
	public static void main (String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = 568732;
		conta.agencia = 6548;
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = -10;
		
		System.out.println("Numero da conta " + conta.numero + " = " + conta.saldo);
		System.out.println("Numero da agencia: " + conta.agencia);
		System.out.println("Tem limite especial: " + conta.especial);
		System.out.println("Qual é o limite especial: " + conta.limiteEspecial);
		

		
		
	}
	
}
