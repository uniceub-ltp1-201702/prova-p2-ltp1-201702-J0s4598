package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Esportes;

public class ViewExibirEsporte {
	
	public void exibirEsportes(ArrayList<Esportes> esportes){
		//
		String todosEsporte = "";
		//
		for (int i = 0; i < esportes.size(); i++) {
			todosEsporte = todosEsporte + esportes.get(i).toString() + "\n";
		}
		//
		JOptionPane.showMessageDialog(null, todosEsporte);
	}

}
