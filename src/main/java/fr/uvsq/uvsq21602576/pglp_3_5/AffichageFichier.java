package fr.uvsq.uvsq21602576.pglp_3_5;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Classe pour afficher dans un fichier text.log.
 * Implémente Affichage.
 * @author Flora
 */
public class AffichageFichier implements Affichage {

    /**
     * Nom du fichier d'écriture.
     */
    private final String fichier;

    /**
     * Constructeur.
     * Initialise un affichage avec le nom du fichier d'écriture.
     * @param nomFichier    Chemin fichier d'écriture
     */
    public AffichageFichier(final String nomFichier) {
        this.fichier = nomFichier;
    }

    /**
     * Ecrit le message dans le fichier.
     * Sous forme "date - message".
     * @param   message Message à écrire
     */
    public void print(final String message) {
        try (FileWriter file = new FileWriter(this.fichier, true)) {
            String date = LocalDateTime.now().toString();
            file.write(date + " - " + message + "\n");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
