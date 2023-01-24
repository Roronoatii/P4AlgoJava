import java.util.Scanner;
import java.util.Arrays;

import Class.jeton;


public class App {

    public static void main (String[] args) throws Exception{
        int userchoice;
        do {
            printMenu();
            userchoice = getMenuChoice();
            switch (userchoice){
                case 1:
                    grid(args);
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
    
    public static void grid(String[] args) throws Exception {

        String[] ligne1 = {" "," "," "," "," "," "," "};
        String[] ligne2 = {" "," "," "," "," "," "," "};
        String[] ligne3 = {" "," "," "," "," "," "," "};
        String[] ligne4 = {" "," "," "," "," "," "," "};
        String[] ligne5 = {" "," "," "," "," "," "," "};
        String[] ligne6 = {" "," "," "," "," "," "," "};

        String[][] lignes = {ligne1, ligne2, ligne3, ligne4, ligne5, ligne6};
        execTab(ligne1,ligne2,ligne3,ligne4,ligne5,ligne6);

        Scanner scanner = new Scanner(System.in);
        int w = 30;
        while (w == 30) {
            System.out.print("Entrez une valeur : ");
            int nombreEntier = scanner.nextInt();
            if(nombreEntier == 10){
                w = 20;
                break;
            }
            // Code à exécuter avec la variable 'nombreEntier'
            joueur1(lignes, nombreEntier);
            execTab(ligne1,ligne2,ligne3,ligne4,ligne5,ligne6);
            // joueur1(lignes, nombreEntier);
        }
        scanner.close();
        System.out.println("Done");
    }

    public static void execTab(String[] ligne1, String[] ligne2, String[] ligne3, String[] ligne4, String[] ligne5, String[] ligne6) {
        System.out.println(Arrays.toString(ligne1));
        System.out.println(Arrays.toString(ligne2));
        System.out.println(Arrays.toString(ligne3));
        System.out.println(Arrays.toString(ligne4));
        System.out.println(Arrays.toString(ligne5));
        System.out.println(Arrays.toString(ligne6));
    }

    public static void joueur1(String[][] lignes,int nombreEntier) {

        for (int i = 5; i > -1; i--) {
            
            if(lignes[i][nombreEntier] == " " && lignes[i][nombreEntier] != "@" && lignes[i][nombreEntier] != "="){
                lignes[i][nombreEntier] = "@";
                break;
                
            }
        }
        
    }

    public static void joueur2(String[][] lignes,int nombreEntier) {

        for (int a = 5; a > 0; a--) {
            
            if(lignes[a][nombreEntier] == " " && lignes[a][nombreEntier] != "@" && lignes[a][nombreEntier] != "="){
                lignes[a][nombreEntier] = "=";
                break;
                
            }
        }
        
    }

//--------------------------------------
import java.util.Scanner;
public class Main {
    static int size;
    static int select = 0;
    static int turn = 0;
    static boolean winner = false;

    private static void displayBoard(char[][] board) {
        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board.length; i++) {
                //deleting last
                if (i == board[j].length -1) System.out.print(board[j][i]);
                else System.out.print( board[j][i] + " | ");
            }
            System.out.println();
        }
    }
    static int winplay1 = 0;

    public static void winCheck(char player1, char[][] board){
        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board.length - 2; i++) {
                if (board[j][i] == player1) {
                    if (board[j][i + 1] == player1) {
                        if (board[j][i + 2] == player1) {
                            winner = true;
                            System.out.println("Player 1 win !");
                        }
                    }
                }
            }
        }
    }
    public static void winCheck3(char player2, char[][] board){
        for (int j = 0; j < board.length; j++) {
            for (int i = 0; i < board.length - 2; i++) {
                if (board[j][i] == player2) {
                    if (board[j][i + 1] == player2) {
                        if (board[j][i + 2] == player2) {
                            winner = true;
                            System.out.println("Player 2 win !");
                        }
                    }
                }
            }
        }
    }
    public static void winCheck4(char player2, char[][] board){
        for (int j = 0; j < board.length - 2; j++) {
            for (int i = 0; i < board.length; i++) {
                if (board[j][i] == player2) {
                    if (board[j + 1][i] == player2) {
                        if (board[j + 2][i] == player2) {
                            winner = true;
                            System.out.println("Player 2 win !");
                        }
                    }
                }
            }
        }
    }
    public static void winCheck2(char player1, char[][] board){
        for (int j = 0; j < board.length - 2; j++) {
            for (int i = 0; i < board.length; i++) {
                if (board[j][i] == player1) {
                    if (board[j + 1][i] == player1) {
                        if (board[j + 2][i] == player1) {
                            winner = true;
                            System.out.println("Player 1 win !");
                        }
                    }
                }
            }
        }
    }
    public static void winCheck6(char player1, char[][] board){
        for (int j = 0; j < board.length - 2; j++) {
            for (int i = 0; i < board.length - 2; i++) {
                if (board[j][i] == player1) {
                    if (board[j + 1][i + 1] == player1) {
                        if (board[j + 2][i + 2] == player1) {
                            winner = true;
                            System.out.println("Player 1 win !");
                        }
                    }
                }
            }
        }
    }
    public static void winCheck5(char player2, char[][] board){
        for (int j = 0; j < board.length - 2; j++) {
            for (int i = 0; i < board.length - 2; i++) {
                if (board[j][i] == player2) {
                    if (board[j + 1][i + 1] == player2) {
                        if (board[j + 2][i + 2] == player2) {
                            winner = true;
                            System.out.println("Player 2 win !");
                        }
                    }
                }
            }
        }
    }
    public static void winCheck7(char player1, char[][] board){
        for (int j = 2; j < board.length; j++) {
            for (int i = 0; i < board.length - 2; i++) {
                if (board[j][i] == player1) {
                    if (board[j - 1][i + 1] == player1) {
                        if (board[j - 2][i + 2] == player1) {
                            winner = true;
                            System.out.println("Player 1 win !");
                        }
                    }
                }
            }
        }
    }
    public static void winCheck8(char player2, char[][] board){
        for (int j = 2; j < board.length; j++) {
            for (int i = 0; i < board.length - 2; i++) {
                if (board[j][i] == player2) {
                    if (board[j - 1][i + 1] == player2) {
                        if (board[j - 2][i + 2] == player2) {
                            winner = true;
                            System.out.println("Player 2 win !");
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        //ask input(board size).
        System.out.print("Enter Size: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        //Board dimension.
        char[][] board = new char[size][size];
        //Character inside the grid.
        char ch = ' ';
        //Board
        for (int j = 0; j < size; j++){
            for (int i = 0; i < size; i++) {
                board[j][i] = ch;
            }
        }


        displayBoard(board);
        while (winner == false){
            System.out.print("Enter Row between 1 & " + size + ": ");
            int row = input.nextInt();
            if (row <= size){
                select = 1;
                while (select == 1){
                        System.out.print("Enter Column between 1 & " + size + ": ");
                        int col = input.nextInt();
                    if (col <= size){
                        select = 0;
                        if(turn == 0 && board[row - 1][col - 1] == ' '){
                            board[row - 1][col - 1] = 'X';
                            turn = 1;
                            System.out.println();
                            displayBoard(board);
                            System.out.println();
                            System.out.println("Other player turn");
                        }else if(turn == 1 && board[row - 1][col - 1] == ' '){
                            board[row - 1][col - 1] = 'O';
                            turn = 0;
                            System.out.println();
                            displayBoard(board);
                            System.out.println();
                            System.out.println("Other player turn");
                        }else{
                            System.out.println();
                            System.out.println("The spot in already taken !");
                        }
                    }else{
                        System.out.println("Enter a correct column !");
                    }
                }
            }else{
                System.out.println("Enter a correct row !");
            }
            winCheck('X', board);
            winCheck2('X', board);
            winCheck3('O', board);
            winCheck4('O', board);
            winCheck5('O', board);
            winCheck6('X', board);
            winCheck7('X', board);
            winCheck8('O', board);
        }
    }
}




}

