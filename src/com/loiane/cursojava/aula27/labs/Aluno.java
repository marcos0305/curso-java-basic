package com.loiane.cursojava.aula27.labs;

public class Aluno {

	String nome;
	String matricula;
	String curso;
	String [] disciplinas = new String [3];
	double[][] notas = new double [3][4];
	
	
	void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Curso: " + curso);

		for(int i=0; i<disciplinas.length; i++){
			System.out.println("Notas da disciplina " + disciplinas[i]);
			for(int j=0; j<notas[i].length; j++){
				System.out.println(notas[i][j] +"");
			}
			System.out.println();
		}
	}
	 boolean verificarAprovado(int indice){
		 
		 double soma = 0;
		 		 
		 for(int i=0; i<notas[indice].length; i++){
			soma += notas[indice][i];		 					 
		 }
		 
		 double media = soma / 4;
		 
		 if(media >= 7){
			 
			 return true;
			 
		 }else{
			 
			 return false;
			 
		 }
	 }
}
