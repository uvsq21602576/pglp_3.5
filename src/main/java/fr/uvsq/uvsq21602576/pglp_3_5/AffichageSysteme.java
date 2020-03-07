package fr.uvsq.uvsq21602576.pglp_3_5;

import java.time.LocalDateTime;

public class AffichageSysteme implements Affichage {

	public void print(String message) {
		System.out.println(LocalDateTime.now() + " - " + message);
	}
	
}
