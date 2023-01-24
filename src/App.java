public class App {

    //dimesion of the grid
    private final int width, height;
    //Store the last move of the player
    private int lastCol = -1, lastTop = -1;


    public static void main(String[] args) throws Exception {
 
        // déclaration du tableau qui représente la grille de Puissance 4
        String[][] grille = new String[6][7];

        
        // initialisation de la grille avec des espaces vides (aucune pièce jouée)
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                grille[i][j] = " ";

            }
        }
        // affichage de la grille
        for (int i = 0; i < 6; i++) {
            System.out.println("+--+--+--+--+--+--+--+");
            for (int j = 0; j < 7; j++) {
                System.out.print("| " + grille[i][j]);
            }
            System.out.println();
        }
        
    }
}
