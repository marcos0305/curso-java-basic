package com.loiane.cursojava.aula45.labs;

public class Excecao {

	public static void main(String[] args) {

		try {
			int[] vetor = new int[4];
			System.out.println("Antes da exception");

			vetor[4] = 1;

			System.out.println("Esse texto nao sera impresso");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Execao ao acessar um indide de vetor que nao existe");
		}
		System.out.println("Esse texto sera impresso apos a expection");
	}
}
