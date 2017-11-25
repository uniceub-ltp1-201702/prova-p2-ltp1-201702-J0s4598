package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {
	//Atributo
	private String opcao;
	
	//MEtodo
	public String getOpcao(){
		this.opcao = JOptionPane.showInputDialog(
				"Escolha uma opção\n" + 
				"1 - Pesquisar esporte\n" + 
				"2 - Cadastra esport\n" + 
				"3 - Sair\n");
		
		return this.opcao;
	}

}
