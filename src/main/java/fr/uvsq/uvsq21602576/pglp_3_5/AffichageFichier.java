package fr.uvsq.uvsq21602576.pglp_3_5;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class AffichageFichier implements Affichage {
	
	public void print(String message) {
		try {
			FileWriter file = new FileWriter("text.txt",true);
			file.write(LocalDateTime.now()+" - "+message+"\n");
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
