package model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;

public class BD {
	//Atributos
	private ArrayList<Esportes> esportes;
	private ArrayList<Medalhas> medalhas;
	private String fileName1 = "esportes.txt";
	private String fileName2 = "medalhas.txt";
	private DocumentReader dr;
	private DocumentWriter dw;
	
	//Metodo Construtor
	public BD(){
		//ArrayList
		this.esportes = new ArrayList<Esportes>();
		this.medalhas = new ArrayList<Medalhas>();
		//Reader
		this.dr = new DocumentReader();
		//Writer
		this.dw = new DocumentWriter();
	}
	//Ex 2.3
	public void carregarEsportes(){
		ArrayList<String> linha = dr.read(fileName1);
		
		for (int i = 0; i < linha.size(); i++) {
			String[] linhaEsportes = linha.get(i).split(";");
			Esportes e = new Esportes(linhaEsportes[0], linhaEsportes[1]);
			
			this.esportes.add(e);
		}
	}
	
	public Esportes getEsportePorNome(String e){
		Esportes retorno = null;
		//
		for (int i = 0; i < this.esportes.size(); i++) {
			if (this.esportes.get(i).getEsport().equals(e)) {
				retorno = this.esportes.get(i);
			}
		}
		return retorno;
	}
	
	public ArrayList<Esportes> getEsportes() {
		return esportes;
	}
	
	//Ex 2.4
		public void carregarMedalhas(){
			ArrayList<String> linha = dr.read(fileName2);
			
			for (int i = 0; i < linha.size(); i++) {
				String[] linhaMedalhas = linha.get(i).split(";");
				Medalhas m = new Medalhas(linhaMedalhas[0], Integer.parseInt(linhaMedalhas[1]),  Integer.parseInt(linhaMedalhas[2]),  Integer.parseInt(linhaMedalhas[3]),  Integer.parseInt(linhaMedalhas[4]));
				this.medalhas.add(m);
			}
		}
		public ArrayList<Medalhas> getMedalhas() {
			return medalhas;
		}
		
	//Metodo que grava esporte
		public void gravarEsporte(Esportes e){
			//
			this.esportes.add(e);
			//
			dw.write(this.fileName1, e.toLinha());
		}
		
		//
		public boolean existeModa(String modalidade){
			boolean retorno = false;
			
			for (int i = 0; i < this.esportes.size(); i++) {
				if (this.esportes.get(i).getModalidade().equals(modalidade)) {
					retorno = true;
				}
			}
			return retorno;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}

