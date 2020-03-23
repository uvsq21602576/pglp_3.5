package fr.uvsq.uvsq21602576.pglp_3_5;

import java.time.LocalDateTime;

/**
 * Classe pour afficher dans la console.
 * (System.out.println)
 * Implémente Affichage.
 * @author Flora
 */
public class AffichageSysteme implements Affichage {

    /**
     * Affiche le message dans la console.
     * @param message   Message à écrire
     */
    public void print(final String message) {
        System.out.println(LocalDateTime.now() + " - " + message);
    }

}
