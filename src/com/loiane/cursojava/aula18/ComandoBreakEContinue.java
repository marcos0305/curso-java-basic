package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class ComandoBreakEContinue {

	public static void main(String[] args) {
		
		
		//BREAK//
		
		/*Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero: ");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite: ");
		int max = scan.nextInt();
		
		for (int i=num; i<=max; i++) {
			
			if (i % 7 == 0) {
				System.out.println("O valor de i é: " + i);
				break;
			}
		}*/
		
		// CONTINUE //
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero: ");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite: ");
		int max = scan.nextInt();
		
		for (int i=num; i<=max; i++) {
			
			if (i % 7 == 0) {
				continue;
			}
			System.out.println("o valor de i é: " + i);
		}
		
		
		
	}
  
}
