package com.loiane.cursojava.aula43;

public class Aluno {

	public Aluno() {
		super();

	}

	private String curso;
	private double[] notas;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0;
	}

	public boolean verrificarAprovado() {
		return true;
	}

	public String toString() {
		String s = curso + "\n";
		for (double nota : notas) {
			s += nota + " ";
		}
		return s;
	}
	
} 
