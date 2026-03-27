package br.com.fiapride.model;

public class Garrafa {

	private String cordatampa;
	private String marca;
	private String materialdagarrafa;

	public Garrafa(String marca, String materialdagarrafa) {
		this.marca = marca;
		this.materialdagarrafa = materialdagarrafa;
	}

	public String getCordatampa() {
		return cordatampa;
	}

	public void setCordatampa(String cordatampa) {
		this.cordatampa = cordatampa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMaterialdagarrafa() {
		return materialdagarrafa;
	}

	public void setMaterialdagarrafa(String materialdagarrafa) {
		this.materialdagarrafa = materialdagarrafa;
	}
}