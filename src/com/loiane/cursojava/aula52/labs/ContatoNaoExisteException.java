package com.loiane.cursojava.aula52.labs;

public class ContatoNaoExisteException extends Exception {

	private String nomeContato;
	
	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	public String getMessage() {
		return "Contato" + nomeContato + "nao encontrato na agenda!";
	}
}
