package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;


public class Score{
    // propriété privée pour stocker le score
    private int score;
    // propriété privée pour stocker l'objet Joueur
    private Joueur joueur;

    // méthode pour récupérer l'objet Joueur
    public Joueur getJoueur () {
        return joueur;
    }

    // méthode pour définir l'objet Joueur
    public void setJoueur (Joueur joueur) {
        this.joueur = joueur;
    }

    // méthode pour récupérer la valeur du score
    public int getScore () {
        return score;
    }

    // méthode pour définir la valeur du score
    public void setScore (int score) {
        this.score = score;
    }
    // méthode pour afficher le score
    @Override
    public String toString() {
        return "Score [joueur=" + joueur + ", score=" + score + "]";
    }

    // méthode pour enregistrer le score dans un fichier texte csv
    public void saveScore() {
        try {
            FileWriter fw = new FileWriter("score.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(joueur.getNom() + "," + score);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erreur lors de l'écriture du fichier");
        }
        //Affichage du score du joueur à l'écran et fermeture du programme
        System.out.println("Le score du joueur " + this.joueur + " est de " + this.score);
    }

    // méthode pour efffacer tout les score dans le fichier texte csv

    public void deleteScore() {
        try {
            FileWriter fw = new FileWriter("score.csv", false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("");
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erreur lorsque tu effaces le fichier");
        }
    }

}
