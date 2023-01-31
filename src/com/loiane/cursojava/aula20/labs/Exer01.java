package com.loiane.cursojava.aula20.labs;

import java.util.Random;

public class Exer01 {

	public static void main(String[] args) {
		
	int[][] numerosAleatorios = new int [5][5];
	
	Random Random = new Random ();
	
	for (int i=0; i<numerosAleatorios.length; i++){
		for (int j=0; j<numerosAleatorios[i].length; j++){
					 numerosAleatorios [i][j] = Random.nextInt (50);
				 }
			}
					
	int maior = 0;
	int linha = 0;
	int col = 0;
		
	for (int i=0; i<numerosAleatorios.length;i++){
		for (int j=0; j<numerosAleatorios[i].length; j++){
							
				if(numerosAleatorios[i][j] > maior){
					maior =  numerosAleatorios [i][j];
					linha = i;
					col = j;
										
					}	
				}	
			}
		for (int i=0; i<numerosAleatorios.length;i++){
			for(int j=0; j<numerosAleatorios[i].length; j++){
				System.out.println(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}
	
		System.out.println("Maior valor: " + maior);
		System.out.println("Maior linha: " + linha);
		System.out.println("Maior coluna: " + col);
			
	}
}

