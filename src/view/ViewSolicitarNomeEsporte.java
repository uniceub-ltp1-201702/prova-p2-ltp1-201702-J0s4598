package view;

import javax.swing.JOptionPane;


public class ViewSolicitarNomeEsporte {
	//
	private String nome;
	
	public ViewSolicitarNomeEsporte(){
		this.nome = JOptionPane.showInputDialog("Digite o nome:");
	}

	public String getNome() {
		return nome;
	}
	

}
