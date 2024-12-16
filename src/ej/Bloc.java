package ej;

public abstract class Bloc implements IBloc {
    protected Couleur couleur;
    protected int longueur;
    protected int largeur;
    protected int hauteur;

    public Bloc(final int longueur, final int largeur, final int hauteur, Couleur couleur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.couleur = couleur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public Couleur getCouleur() {
        return couleur;
    }
}