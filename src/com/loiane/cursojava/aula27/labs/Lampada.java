package com.loiane.cursojava.aula27.labs;

public class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMes;
	String[] tipos;
	boolean tipoAbajur;
	
	boolean ligada;
	void ligar() {
		ligada = true;
	}
	void deligar() {
		ligada = false;		
	}
	void mostrarEstado(){
		if(ligada){
			System.out.println("Lâmpada está ligada");
		}else {
			System.out.println("Lâmpada está desligada ");
		}
	}
	
	void mudarEstado() {
		if(ligada) {
			deligar();
		}else {
			ligar();
		}
	}
}
