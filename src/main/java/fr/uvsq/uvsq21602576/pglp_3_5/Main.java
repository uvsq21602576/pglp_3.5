package fr.uvsq.uvsq21602576.pglp_3_5;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		UneClasseMetierLogger m = new UneClasseMetierLogger();
		m.uneMethodeMetier();
		
		UneClasseMetierInterface I = new UneClasseMetierInterface(new AffichageFichier());
		I.uneMethodeMetier();
		
		I = new UneClasseMetierInterface(new AffichageSysteme());
		I.uneMethodeMetier();
	}
	
}
