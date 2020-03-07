package fr.uvsq.uvsq21602576.pglp_3_5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UneClasseMetierInterface {
	private Affichage A;

	public UneClasseMetierInterface(Affichage A) {
		this.A = A;
	}
	
	public void uneMethodeMetier () {
		A.print("Debut de uneMethodeMetier");
		//traitement
		A.print("Fin de uneMethodeMetier");
	}

}
