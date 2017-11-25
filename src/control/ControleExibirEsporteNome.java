package control;

import java.util.ArrayList;

import model.BD;
import model.Esportes;
import view.ViewExibirEsporte;
import view.ViewSolicitarNomeEsporte;

public class ControleExibirEsporteNome {
	//Atributos
	private BD bd;
	private ViewExibirEsporte vee;
	
	//MetodoConstrutor
	public ControleExibirEsporteNome(BD bd){
		this.bd = bd;
		//Instanciar
		this.vee = new ViewExibirEsporte();
	}
	//
	public void exebirEsportes(){
		//
		ArrayList<Esportes> esportes = this.bd.getEsportes();
		//
		this.vee.exibirEsportes(esportes);
	}

}
