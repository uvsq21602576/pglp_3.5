package fr.uvsq.uvsq21602576.pglp_3_5;

/**
 * Classe métier.
 * Avec affichage grâce à Interface personnelle
 * @author Flora
 */
public class UneClasseMetierInterface {
    /**
     * Interface affichage.
     */
    private final Affichage affichage;

    /**
     * Constructeur.
     * Crée une classe métier,
     * qui utilisera l'affichage en paramêtre.
     * @param a    affichage
     */
    public UneClasseMetierInterface(final Affichage a) {
        this.affichage = a;
    }

    /**
     * Une méthode métier.
     * Le début et la fin sont afficher.
     */
    public void uneMethodeMetier() {
        affichage.print("Debut de uneMethodeMetier");
        //traitement
        affichage.print("Fin de uneMethodeMetier");
    }

}
