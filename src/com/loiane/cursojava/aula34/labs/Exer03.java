package com.loiane.cursojava.aula34.labs;

import java.util.Scanner;

public class Exer03 {

	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("Entre com o numero positivo");
			num = scan.nextInt();
			
			if(num < 0) {
				System.out.println("Numero invalido, entre novamente");
			}
			
		}while (num < 0);
		
		System.out.println(Calculadora.fatorial(num));
	}
	
}
