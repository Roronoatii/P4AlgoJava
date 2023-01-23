public class Joueur {
    private String nom;
    private String couleur;
    private String symbole;

    public Joueur(String nom, String couleur, String symbole) {
        this.nom = nom;
        this.couleur = couleur;
        this.symbole = symbole;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }
}