package control;

import javax.swing.JOptionPane;

import model.BD;
import view.ViewPrincipal;

public class ControlPrincipal {
	private BD bd;
	private ViewPrincipal vp;
	private ControleExibirEsporteNome ceen;
	private ControlCadastraEsporte cce;
	
	
	//Metodo Construtor
	public ControlPrincipal(){
		//
		this.bd = new BD();
		//
		this.vp = new ViewPrincipal();
		//
		this.ceen = new ControleExibirEsporteNome(bd);
		this.cce = new ControlCadastraEsporte(bd);
		
		//
		tratarOpcao(this.vp.getOpcao());
	}
	//Metodo para tratar opcao
	public void tratarOpcao(String opcao){
		while(true){
			switch(opcao){
			case "1": this.ceen.exebirEsportes();
						break;
						
			case "2": this.cce.cadastraEsportes();
						break;
						
			case "3": JOptionPane.showMessageDialog(null, "Até breve!");
			return;
			
			default: JOptionPane.showMessageDialog(null, "Favor Digitar Numero valido!");
						break;
			}
			
			//Exibir a Janela de Opcoes
			opcao = this.vp.getOpcao();
		}
	}

}
