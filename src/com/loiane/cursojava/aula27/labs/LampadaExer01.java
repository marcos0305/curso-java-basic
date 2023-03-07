package com.loiane.cursojava.aula27.labs;

public class LampadaExer01 {

	public static void main(String [] args) {
		
		Lampada lampada = new Lampada();				
		
		lampada.ligar();
		
		lampada.mostrarEstado();
				
		lampada.deligar();		
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
	}
}
