package com.loiane.cursojava.aula48;

public class MutiplosCatch {

	public static void main(String[] args) {
		int[] numeros = { 4, 8, 16, 32, 64, 123 };
		int[] demon = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
			}
			catch (ArithmeticException exc) {
				System.out.println("Erro ao dividir por zero");
			}
			catch (ArrayIndexOutOfBoundsException exc) {
				System.out.println("Posicao errada do array");
			}
		}

	}
}
