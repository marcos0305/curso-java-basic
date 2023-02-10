package com.loiane.cursojava.aula24.labs;

public class Exer03 {

	public static void main(String[] args) {
		
		LivroLivraria livro = new LivroLivraria();
		
		livro.nome = "Control";
		livro.autor = "Marcovik";
		livro.anoLancamento = 2021;
		livro.qtdPaginas = 230;
		livro.preço = 500;
		
		
		System.out.println("Nome do livro: " + livro.nome); 
		System.out.println("Nome do autor: " + livro.autor); 
		System.out.println("Data do lançamento: " + livro.anoLancamento); 
		System.out.println("Quantidade de pagina: " + livro.qtdPaginas);
		System.out.println("Valor do livro: " + livro.preço); 


	}
	
}
