package fr.uvsq.uvsq21602576.pglp_3_5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Classe métier.
 * Dont l'affichage se fait par l'intermédiraire d'un logger.
 * @author Flora
 */
public class UneClasseMetierLogger {
    /**
     * Logger.
     */
    public static final Logger LOGGER
    = LoggerFactory.getLogger(UneClasseMetierLogger.class);

    /**
     * Constructeur.
     */
    public UneClasseMetierLogger() {
    }

    /**
     * Une méthode métier.
     * Le début et la fin sont afficher.
     */
    public void uneMethodeMetier() {
        LOGGER.info("Debut de uneMethodeMetier");
        //traitement
        LOGGER.info("Fin de uneMethodeMetier");
    }

}
