package ej;

public class Main {

    public static void main(String[] args) {
        Mur unBlocMur = new Mur(100,100,50,true, Couleur.VERT);
        unBlocMur.afficherBloc();
        unBlocMur.afficherUneDescription();
        System.out.println(unBlocMur.getCouleur());
        unBlocMur.setCouleur(Couleur.BLEU);
        System.out.println(unBlocMur.getCouleur());
        Rempart monRempart = new Rempart(unBlocMur);
        System.out.println(monRempart.toString());
    }

}