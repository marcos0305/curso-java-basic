package com.loiane.cursojava.aula24.labs;

public class Exer02 {

	public static void main (String[] args) {
		
		Livro livro = new Livro();
		
		livro.nome = "A sutil arte de ligar o botao f*****";
		livro.autor = "Mark Manson";
		livro.qtdPaginas = 221;
		livro.anoLançamento = 2019;
		
		System.out.println("Nome do livro: " + livro.nome);
		System.out.println("Nome do autor: " + livro.autor);
		System.out.println("Quantidade de paginas: " + livro.qtdPaginas);
		System.out.println("Ano lançado: " + livro.anoLançamento);

	}
	
}
