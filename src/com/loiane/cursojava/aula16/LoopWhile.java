package com.loiane.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1;
		int max = 15;
		
		System.out.println("O valor maximo é de: " + max);
		
		while (i <  max) {
			System.out.println("O valor de i é: " + i);
			i++;
			}
		
			System.out.println(i); // valor de 15
			
			do {
				i++;
				System.out.println("O valor de i: " + i);
	
			}while (i < 15); 
			
			System.out.println(i);
	}
	

}
