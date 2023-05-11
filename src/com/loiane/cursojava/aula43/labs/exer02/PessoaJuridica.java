package com.loiane.cursojava.aula43.labs.exer02;

public class PessoaJuridica extends Contribuinte {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		return this.getRendaBruta() / 100 * 10;
	}

	@Override
	public String toString() {
		String s = "Pessoa Juridica[";
		s += super.toString();
		s += " ;cnpj: " + cnpj;
		s += " ;imposto a ser pago pelo cnpj: " + calcularImposto();
		s += " ]";
		return s;

	}
}
