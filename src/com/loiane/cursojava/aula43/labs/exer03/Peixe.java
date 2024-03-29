package com.loiane.cursojava.aula43.labs.exer03;

public class Peixe extends Animal {

	private String caracteristica;

	public Peixe() {
		super();
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("cinzenta");
		this.caracteristica = "barbatanas e cauda";
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCaracteristica: " + caracteristica;
		return s;
	}
}
