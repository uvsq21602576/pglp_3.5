package fr.uvsq.uvsq21602576.pglp_3_5;

/**
 * Classe contenant le main du programme.
 * @author Flora
 */
public enum Main {
    /**
     * Singleton main.
     */
    MAIN;

    /**
     * Méthode contenant le corps du main.
     */
    public void run() {
        UneClasseMetierLogger m = new UneClasseMetierLogger();
        m.uneMethodeMetier();

        UneClasseMetierInterface i;
        i = new UneClasseMetierInterface(new AffichageFichier("text.log"));
        i.uneMethodeMetier();

        i = new UneClasseMetierInterface(new AffichageSysteme());
        i.uneMethodeMetier();
    }

    /**
     * Méthode main.
     * @param args arguments
     */
    public static void main(final String[] args) {
        MAIN.run();
    }
}
