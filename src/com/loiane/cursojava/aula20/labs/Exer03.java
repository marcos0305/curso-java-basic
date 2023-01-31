package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		  
		
		Scanner scan = new Scanner(System.in);
		
		int[][] numeros = new int [3][3];
		
		for(int i=0; i<numeros.length; i++) {
			for (int j=0; j<numeros[i].length; j++){
				
				System.out.println("Digite o valor da pos [" + i + "," + j+ "]");
				numeros[i][j] = scan.nextInt();
			}
		}
		
		int Pares = 0;
		int Impares = 0;
		for(int i=0; i<numeros.length; i++) {
			for(int j=0; j<numeros[i].length; j++){
				
				
				if(numeros[i][j] % 2 == 0) {
					Pares++;
				}else {
					Impares++;
				}
			}
		}
		
		for(int i=0; i<numeros.length; i++) {
			for(int j=0; j<numeros.length; j++) {
				System.out.print(numeros[i][j] + " ");
		}
		System.out.println();
	}
		System.out.println("Pares = "  + Pares);
		System.out.println("Impares = "  + Impares);

		
}
}