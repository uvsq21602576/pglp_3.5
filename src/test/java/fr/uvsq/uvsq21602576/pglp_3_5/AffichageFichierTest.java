package fr.uvsq.uvsq21602576.pglp_3_5;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

/**
 * Classe de test pour AffichageFichier.
 * @author Flora
 */
public class AffichageFichierTest {

    /**
     * Teste la méthode print.
     * Crée, écrit, et supprime un fichier "log.test"
     * @throws FileNotFoundException Exception si log.test n'existe pas.
     */
    @Test
    public void printTest() throws FileNotFoundException {
        Affichage a = new AffichageFichier("log.test");
        a.print("Essai log test.");
        Scanner s = new Scanner(new File("log.test"));
        String observed = "";
        while (s.hasNextLine()) {
            observed = s.nextLine();
        }
        s.close();
        new File("log.test").delete();
        assertEquals("Essai log test.", observed.substring(32));
    }
}
