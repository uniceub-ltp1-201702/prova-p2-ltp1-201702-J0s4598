package model;

public class Medalhas {
	//Atributos
	private String pais;
	private int medalhasDeOuro;
	private int medalhasDePrata;
	private int medalhasDeBronze;
	private int posiçãoNoRanking;
	
	//Metodo
	public Medalhas(String pais, int medalhasDeOuro, int medalhasDePrata, int medalhasDeBronze, int posiçãoNoRanking) {
		super();
		this.pais = pais;
		this.medalhasDeOuro = medalhasDeOuro;
		this.medalhasDePrata = medalhasDePrata;
		this.medalhasDeBronze = medalhasDeBronze;
		this.posiçãoNoRanking = posiçãoNoRanking;
	}

	//Get e Set
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getMedalhasDeOuro() {
		return medalhasDeOuro;
	}

	public void setMedalhasDeOuro(int medalhasDeOuro) {
		this.medalhasDeOuro = medalhasDeOuro;
	}

	public int getMedalhasDePrata() {
		return medalhasDePrata;
	}

	public void setMedalhasDePrata(int medalhasDePrata) {
		this.medalhasDePrata = medalhasDePrata;
	}

	public int getMedalhasDeBronze() {
		return medalhasDeBronze;
	}

	public void setMedalhasDeBronze(int medalhasDeBronze) {
		this.medalhasDeBronze = medalhasDeBronze;
	}

	public int getPosiçãoNoRanking() {
		return posiçãoNoRanking;
	}

	public void setPosiçãoNoRanking(int posiçãoNoRanking) {
		this.posiçãoNoRanking = posiçãoNoRanking;
	}
	

}
