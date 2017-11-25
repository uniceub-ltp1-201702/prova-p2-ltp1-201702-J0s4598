package model;

public class Esportes {
	//Atributo
	private String esporte;
	private String modalidade;
	
	//Metodo
	public Esportes(String esport, String modalidade) {
		super();
		this.esporte = esport;
		this.modalidade = modalidade;
	}

	//Geet e Set
	public String getEsport() {
		return esporte;
	}

	public void setEsport(String esport) {
		this.esporte = esport;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	//toString
	public String toString(){
		return "Esporte: " + this.esporte + "\n" + 
				"Modalidade: " + this.modalidade + "\n";
	}
	
	//
	public String toLinha(){
		return getEsport() + ";" + getModalidade();
	}
	
	

}
