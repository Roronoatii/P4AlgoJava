import java.util.Scanner;

import Class.jeton;


public class App {

    public static void main (String[] args){
        int userchoice;
        do {
            printMenu();
            userchoice = getMenuChoice();
            switch (userchoice){
                case 1:
                    System.out.println("singleplayer");
                    break;
                case 2:
                    System.out.println("multiplayer");

                    break;
                case 3:
                    System.out.println("display");

                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Input");

            }
        } while (userchoice != 5);
    }
    public static void printMenu(){
        System.out.println("--Menu--");
        System.out.println("1. SinglePlayer");
        System.out.println("2. Multiplayer");
        System.out.println("3. Display Top 10");
        System.out.println("4. Exit");
    }

    public static int getMenuChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        return choice;
    }
    public static void closeScanner(Scanner scanner) {
        scanner.close();
    }
    
    // public static void grid(String[] args) throws Exception {

    //     // déclaration du tableau qui représente la grille de Puissance 4
    //      String[][] grille = new String[6][7]; 
    //      // initialisation de la grille avec des valeurs de 0 (aucune pièce jouée)
    //      for (int i = 0; i < 6; i++) {
    //          for (int j = 0; j < 7; j++) {
    //              grille[i][j] = " ";
    //              grille[5][2] = "@";
    //              grille[5][3] = "=";            }
    //      }
 
    //      // affichage de la grille
    //      System.out.println("\n-1--2--3--4--5--6--7-");
    //      for (int i = 0; i < 6; i++) {
    //          for (int j = 0; j < 7; j++) {
    //             System.out.print("|"+grille[i][j] + "|");
                
    //          }
    //          System.out.println("\n---------------------");
    //      }
    //      System.out.println(grille[2][3]);
    //  }
    
}
//     public static void scan(String[] args Menu) {
//         String userInput = getUserInput();
//         System.out.println("You entered: " + userInput);
//     }
//     public static String getUserInput() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String input = scanner.nextLine();
//         scanner.close();
//         return input;
//     }
// }