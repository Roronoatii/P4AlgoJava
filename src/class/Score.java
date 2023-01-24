package Class;

public class Score {
    private int score;
    private int joueur;
    
    public Score(int score, int joueur) {
        this.score = score;
        this.joueur = joueur;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public int getJoueur() {
        return joueur;
    }
    
    public void setJoueur(int joueur) {
        this.joueur = joueur;
    }
    
    public void afficherScore() {
        System.out.println("Le score du joueur " + this.joueur + " est de " + this.score);
    }
    
}
