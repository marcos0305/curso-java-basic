package com.loiane.cursojava.aula48;

public class MutiplosCatchJava7 {
	public static void main(String[] args) {
		int[] numeros = { 4, 8, 16, 32, 64, 123 };
		int[] demon = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
			}
			catch (ArithmeticException | ArrayIndexOutOfBoundsException exc) {
				System.out.println("Aconteceu um erro");
			}
			
		}

	}
}
