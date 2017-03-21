package it.polito.tdp.prova;

public class Pizza {
	
	private String nome;
	private double costoUnitario;
	private String ingredienti;
	
	public Pizza(String nome, double costoUnitario) {
		super();
		this.nome = nome;
		this.costoUnitario = costoUnitario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getCostoUnitario() {
		return costoUnitario;
	}


	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	
	

}
