package com.loiane.cursojava.aula27.labs;

public class ContaCorrente{
	int numero;
	int agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecial = 500;
	double saldo;
	
	
	boolean realizarSaque(double quantiaASacar){
	
		
	//TEM SALDO NA CONTA 
	if (saldo >= quantiaASacar){
		saldo -= quantiaASacar;	
			
			return true;			
				}else{ //nao tem saldo na conta
			if (especial){
				
				//verificar se o limite especial tem saldo
				double limite = limiteEspecial + saldo;
				if (limite >= quantiaASacar){
					saldo -= quantiaASacar;
					
					return true;					
						}else{
					return false;				
						}
						}else{	
					return false; //não é especial e não tem saldo suficiente 
				}
			}
		}
		
		void depositar(double valorDepositado){
		saldo += valorDepositado;			
		}
		void consultarSaldo() {
			System.out.println("Saldo atual da conta = \" + conta.saldo");
		}
		
		boolean verificarUsoChequeEspecial() {
			return saldo < 0;
			
		}		
}
