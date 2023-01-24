package class;

public class Pion {
    
    private int couleur;
    private int colonne;
    private int ligne;
    
    public Pion(int couleur, int colonne, int ligne) {
        this.couleur = couleur;
        this.colonne = colonne;
        this.ligne = ligne;
    }
    
    public int getCouleur() {
        return couleur;
    }
    
    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }
    
    public int getColonne() {
        return colonne;
    }
    
    public void setColonne(int colonne) {
        this.colonne = colonne;
    }
    
    public int getLigne() {
        return ligne;
    }
    
    public void setLigne(int ligne) {
        this.ligne = ligne;
    }
    
    public void afficherPion() {
        System.out.println("Le pion est de couleur " + this.couleur + " et se trouve en colonne " + this.colonne + " et en ligne " + this.ligne);
    }
}
