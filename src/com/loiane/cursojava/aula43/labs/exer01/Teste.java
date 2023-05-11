package com.loiane.cursojava.aula43.labs.exer01;

public class Teste {

	public static void main(String[] args) {

		System.out.println("*** Teste ContaBancaria ***");

		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Conta Simples");
		contaSimples.setNumConta("99999");

		System.out.println(contaSimples);
		
		contaSimples.depositar(100);

		realizarSaque(contaSimples, 50);
		
		realizarSaque(contaSimples, 70);
		
		
		System.out.println("*** Teste ContaPoupanca ***");

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente(" Conta Poupanca ");
		contaPoupanca.setNumConta("22222");
		contaPoupanca.setDiaRendimento( 9 );
		
		System.out.println(contaPoupanca);
		
		contaPoupanca.depositar(100);

		realizarSaque(contaPoupanca, 50);
		
		realizarSaque(contaPoupanca, 70);
		
		
		System.out.println("*** Teste ContaEspecial ***");

		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Conta Simples");
		contaEspecial.setNumConta("33333");
		contaEspecial.setLimite(50);

		System.out.println(contaSimples);
		
		contaEspecial.depositar(100);

		realizarSaque(contaEspecial, 50);
		
		realizarSaque(contaEspecial, 70);
		
		realizarSaque(contaEspecial, 80);
		
		System.out.println(contaEspecial);
		
		if(contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo e de = " + contaPoupanca.getSaldo());			
		}else {
			System.out.println("Hoje nao e dia de rendimento, novo saldo nao calculado");
		}

	}
	
	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, saldo atual = " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de " + valor + " saldo de = " + conta.getSaldo());
		}
	}
	
}

