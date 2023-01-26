package model;


public class Pion {

    private Joueur Joueur; // propriété privée 

    public Pion(model.Joueur joueur) {
        // surement un this
        this.Joueur = joueur; // constructeur
    }
    public Joueur getJoueur() {
        return Joueur; // getter
    }

    public void setJoueur(Joueur joueur) {
        // surement un this
        this.Joueur = joueur; // setter
    }

}