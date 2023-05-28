package com.loiane.cursojava.aula47;

public class Excecao {

	public static void main(String[] args) {

		try {
			int[] vetor = new int[4];

			System.out.println("Antes da exeception");

			vetor[4] = 1;

			System.out.println("Esse texto nao sera impresso");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Esse texto sera imprimido apos a exception");
		}

	}

}
