package ej.blocs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ej.exceptions.IllegalBlocException;
import ej.exceptions.PorteVerrouilleException;

public class Porte extends Bloc {

    private final static Logger logger = LogManager.getLogger(Porte.class);

    private boolean verrouillee;

    public Porte(final int longueur, final int largeur, final int hauteur, final boolean verrouillee)
            throws IllegalBlocException {
        super(longueur, largeur, hauteur, Couleur.BLEU);
        this.verrouillee = verrouillee;
        this.couleur = Couleur.BLEU;
    }

    public boolean estVerrouillee() {
        return verrouillee;
    }

    public void verrouiller() throws PorteVerrouilleException {
        if (verrouillee) {
            logger.error("La porte ne peut pas être verrouillée car c'est déjà le cas.");
            throw new PorteVerrouilleException();
        } else {
            verrouillee = true;
        }
    }

}