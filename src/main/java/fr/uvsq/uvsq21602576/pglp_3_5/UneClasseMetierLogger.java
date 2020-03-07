package fr.uvsq.uvsq21602576.pglp_3_5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UneClasseMetierLogger {
	final static Logger logger = LoggerFactory.getLogger(UneClasseMetierLogger.class);

	public UneClasseMetierLogger() {
		// TODO Auto-generated constructor stub
	}
	
	public void uneMethodeMetier () {
		logger.info("Debut de uneMethodeMetier");
		//traitement
		logger.info("Fin de uneMethodeMetier");
	}

}
