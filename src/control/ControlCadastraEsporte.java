package control;

import model.BD;
import model.Esportes;
import view.ViewCadastraEsporte;
import view.ViewEsporteExiste;
import view.ViewExibirEsporte;

public class ControlCadastraEsporte {
	//
	private BD bd;
	
	public ControlCadastraEsporte(BD bd){
		this.bd = bd;
	}
	public void cadastraEsportes(){
		//
		ViewCadastraEsporte vce = new ViewCadastraEsporte();
		//
		vce.obterDadosDoEsporte();
		
		if (this.bd.existeModa(vce.getModalidade())) {
			
			ViewEsporteExiste vee = new ViewEsporteExiste();
			
			vee.exibirMensage();
		}else{
			Esportes e = new Esportes(vce.getEsporte(), vce.getModalidade());
			this.bd.gravarEsporte(e);
		}
	}

}
