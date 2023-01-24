import java.util.Scanner;

import Class.jeton;


public class App {
    
    public static void main(String[] args) throws Exception {

        // déclaration du tableau qui représente la grille de Puissance 4
         String[][] grille = new String[6][7]; 
         // initialisation de la grille avec des valeurs de 0 (aucune pièce jouée)
         for (int i = 0; i < 6; i++) {
             for (int j = 0; j < 7; j++) {
                 grille[i][j] = " ";
                 grille[i][j] = "@";
                 grille[i][j] = "=";            }
         }
 
         // affichage de la grille
         System.out.println("\n-1--2--3--4--5--6--7-");
         for (int i = 0; i < 6; i++) {
             for (int j = 0; j < 7; j++) {
                System.out.print("|"+grille[i][j] + "|");
                
             }
             System.out.println("\n---------------------");
         }
         System.out.println(grille[2][3]);
     }
    public static void menu (){
        
    }
    public static void scan(String[] args Menu) {
        String userInput = getUserInput();
        System.out.println("You entered: " + userInput);
    }
    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }
}