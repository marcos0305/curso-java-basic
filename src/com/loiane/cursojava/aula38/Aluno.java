package com.loiane.cursojava.aula38;

public class Aluno extends Pessoa {

	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
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
	public boolean verrificarAprovado(){
		return true;
	}
	
	public void metodoQualquer() {
		super.setCpf("84454745785");
		
		this.setCpf("24548435835");
	}
	
}
