import p4.*;


public class Tableau {
    
    public static void main(String[] args) throws Exception {
        // déclaration du tableau qui représente la grille de Puissance 4
         int[][] grille = new int[6][7];
 
         // initialisation de la grille avec des valeurs de 0 (aucune pièce jouée)
         for (int i = 0; i < 6; i++) {
             for (int j = 0; j < 7; j++) {
                 grille[i][j] = 0;
             }
         }
 
         // affichage de la grille
         System.out.println("\n-1--2--3--4--5--6--7-");
         for (int i = 0; i < 6; i++) {
             for (int j = 0; j < 7; j++) {
                System.out.print("|"+grille[i][j] + "|");
                
             }
             System.out.println("\n ------------------- ");
         }
     }
}
