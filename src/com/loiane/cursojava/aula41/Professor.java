package com.loiane.cursojava.aula41;

public class Professor extends Pessoa {

	private String nomeCurso;
	private double[] salario;

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

	public String obterEtiquetaEndereco() {

		String s = "Endereço do Professor";
		s += super.getEndereco();

		return s;

	}

	@Override
	public void imprimirEtiquetaEndereco() {

		System.out.println("Imprimir o endereco do professor");
		System.out.println(this.obterEtiquetaEndereco());
	}
}
