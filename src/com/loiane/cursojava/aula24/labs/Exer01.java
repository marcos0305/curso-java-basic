package com.loiane.cursojava.aula24.labs;

public class Exer01 {

	public static void main (String [] arg) {
		Lampada lampada = new Lampada();
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMes = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		lampada.tipoAbajur = true;
		
		
		
		lampada.tipos = new String [5];
		lampada.tipos [0] = "Abajur";
		lampada.tipos [1] = "Lampião";
		
		
	}
	
}
