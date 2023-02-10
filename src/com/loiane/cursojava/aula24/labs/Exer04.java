package com.loiane.cursojava.aula24.labs;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
		 
		LivroDeBiblioteca livro = new LivroDeBiblioteca ();
 
			livro.nome = "Java util";
			livro.autor = "Mike Willians";
			livro.anoLançamento = 2019;
			livro.qtdPaginas = 150;
			
			
			livro.emprestado = true;
			livro.dataEmprestado = new Date();
			livro.emprestadoA = "Katarinne";
			
			System.out.println("Nome do livro: " + livro.nome);
			System.out.println("Nome do autor: " + livro.autor);
			System.out.println("Quantidade de paginas: " + livro.qtdPaginas);
			System.out.println("Ano lançado: " + livro.anoLançamento);
			System.out.println("O livro foi emprestado: " + livro.emprestado);
			System.out.println("Que dia foi emprestado: " + livro.dataEmprestado);
			System.out.println("Foi emprestado a quem: " + livro.emprestadoA);
	}
	
}
