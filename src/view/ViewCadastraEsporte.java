package view;

import javax.swing.JOptionPane;

public class ViewCadastraEsporte {
	//Atributos
	private String esporte;
	private String modalidade;
	//
	public String getEsporte() {
		return esporte;
	}
	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	//
	public void obterDadosDoEsporte(){
		
		this.setEsporte(JOptionPane.showInputDialog("Informar o Esporte:"));
		this.setModalidade(JOptionPane.showInputDialog("Informa a modalidade:"));
	}

}
