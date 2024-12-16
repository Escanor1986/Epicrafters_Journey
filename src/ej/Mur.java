package ej;

public class Mur extends Bloc {

    private boolean porteur;

    Mur(final int longueur, final int largeur, final int hauteur, final boolean porteur, Couleur couleur) {
        super(longueur, largeur, hauteur, couleur);
        this.porteur = porteur;
    }

    public void afficherBloc() {
        System.out.println(
                super.longueur + " " + super.largeur + " " + super.hauteur + " " + this.porteur
        );
    }


    public boolean estTraversable() {
        return !porteur;
    }

    @Override // Car hérite de l'interface implémentée dans classe mère Bloc
    public void afficherUneDescription() {
        System.out.println("Je suis un mur !");
    }
}
