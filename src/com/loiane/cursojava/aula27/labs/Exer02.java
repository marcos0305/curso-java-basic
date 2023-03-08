package com.loiane.cursojava.aula27.labs;

public class Exer02 {
 
	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = 568732;
		conta.agencia = 6548;
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecial = 0;
		conta.saldo = -10;
		
		System.out.println("Saldo da conta " + conta.saldo + " seu limite é de " + conta.limiteEspecial);
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		if (saqueEfetuado) {
		System.out.println("Saque efetuado com sucesso");
		conta.consultarSaldo();
				
	}else{
		
		System.out.println("Não foi possivel saque. Saldo isuficiente");
	}
		saqueEfetuado = conta.realizarSaque(500);
		
		System.out.println("Tentativa de saque de 500 reais");
		if (saqueEfetuado){
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
			
		}else{
			
			System.out.println("Não foi possivel saque. Saldo isuficiente");
		}
		
		System.out.println("Deposito de 500 reais");
		conta.depositar(500);
		conta.consultarSaldo();
		
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}else {
			System.out.println("Não está usando cheque especial");
		}
		
		conta.realizarSaque(600);
		conta.consultarSaldo();
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}else {
			System.out.println("Não está usando cheque especial");
		}
	}
}
	
