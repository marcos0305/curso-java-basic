package com.loiane.cursojava.aula44;

public class Cachorro extends Mamifero implements AnimalEstimacao {

	private int tamanho;
	private String raça;

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	@Override
	public void amamentar() {

	}

	@Override
	public void emitirSom() {

	}

	@Override
	public void levarPassear() {

	}

	@Override
	public void Alimentar() {

	}

}
