package com.loiane.cursojava.aula27.labs;
	import java.util.Scanner;
public class Exer03 {

	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Nome do aluno: ");
		aluno.nome = scan.next();
		
		System.out.println("Nome do curso: ");
		aluno.curso = scan.next();
		
		System.out.println("Numero da matricula: ");
		aluno.matricula = scan.next();
	
		for(int i=0; i< aluno.disciplinas.length; i++) {
			System.out.println("Entre com o nome da disciplina: " + i);
			aluno.disciplinas[i] = scan.next();			
		}		
		
		for (int i=0; i<aluno.notas.length; i++) {
			System.out.println("Obtendo notas da disciplinas " + aluno.disciplinas[i]);
			for(int j=0; j<aluno.notas [i].length; j++) {
				System.out.println("Entre com a nota: " + (j+1));
				aluno.notas[i][j] = scan.nextDouble();
			}
		}
		aluno.mostrarInfo();
		
		for(int i=0; i<aluno.disciplinas.length; i++) {
			if(aluno.verificarAprovado(i)){
				System.out.println("Disciplina " + aluno.disciplinas[i] + " - foi aprovado");				
			}else {
				System.out.println("Disciplina " + aluno.disciplinas[i] + " - foi reprovado");				

			}
		}
	}
}
