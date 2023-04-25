package com.loiane.cursojava.aula39;

public class Professor extends Pessoa {

	private String nomeCurso;
	private double[] salario;
	
	public void verificarAcesso() {
				
		this.nomeVisibilidade = "kdnfdsg";
		super.nomeVisibilidade = "jdfbdfb";
	}
	
	public double[] getSalario() {
		return salario;
	}
	public void setSalario(double[] salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	   
	public double calcularSalarioLiquido() {
		return 0;
	}
}
	