package com.loiane.cursojava.aula40;

public class Aluno extends Pessoa {

	
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
	public boolean verrificarAprovado(){
		return true;
	}
	
	public void metodoQualquer() {
		super.setCpf("84454745785");
		
		this.setCpf("24548435835");
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endereço do Aluno ";
		s += super.getEndereco();
		
		return s;
		
	}
}
