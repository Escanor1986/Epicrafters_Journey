package ej;

public abstract class Bloc implements IBloc {

    protected int longueur;
    protected int largeur;
    protected int hauteur;
    protected Couleur couleur;

    // Constructeur avec vérification des valeurs et levée d'exception dés l'instanciation de la classe à la construction
    public Bloc(final int longueur, final int largeur, final int hauteur) throws IllegalBlocException {
        if (longueur < MIN_LONGUEUR) {
            throw new IllegalBlocException("La longueur doit être au moins " + MIN_LONGUEUR + " (valeur reçue : " + longueur + ")");
        }
        if (largeur < MIN_LARGEUR) {
            throw new IllegalBlocException("La largeur doit être au moins " + MIN_LARGEUR + " (valeur reçue : " + largeur + ")");
        }
        if (hauteur < MIN_HAUTEUR) {
            throw new IllegalBlocException("La hauteur doit être au moins " + MIN_HAUTEUR + " (valeur reçue : " + hauteur + ")");
        }

        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

}