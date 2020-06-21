package Factory;

import vo.Jogo;
import vo.LotoFacil;
import vo.Mega;
import vo.Quina;

public class FactoryJogo {
	
	public static Jogo criarJogo(int opcao) {
		if(opcao == 1) {
			return new Mega();
		}
		else if(opcao == 2) {
			return new Quina();
		}
		
		else if(opcao == 3) {
			return new LotoFacil();
		}
		
		return null;
	}

}
