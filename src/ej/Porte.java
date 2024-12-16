package ej;

public class Porte extends Bloc {
    private boolean verrouillee;

    public Porte(final int longueur, final int largeur, final int hauteur, final boolean verrouillee, Couleur couleur) {
        super(longueur, largeur, hauteur, couleur);
        this.verrouillee = verrouillee;
    }

    public boolean estVerrouillee() {
        return verrouillee;
    }

    @Override // Car hérite de l'interface implémentée dans classe mère Bloc
    public void afficherUneDescription() {
        System.out.println("Je suis une porte !");
    }
}