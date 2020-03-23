package fr.uvsq.uvsq21602576.pglp_3_5;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

/**
 * Classe de test pour AffichageSysteme.
 * @author Flora
 */
public class AffichageSystemeTest {

    /**
     * Teste la méthode print.
     */
    @Test
    public void printTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Affichage a = new AffichageSysteme();
        a.print("Essai log test.");

        String observed = outContent.toString();
        observed = observed.substring(32, observed.length() - 2);

        System.setOut(System.out);

        assertEquals("Essai log test.", observed);
    }
}
