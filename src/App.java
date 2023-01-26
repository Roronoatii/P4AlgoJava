import java.util.Scanner;


import java.util.Arrays;



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

        int recupligne = 1000;

        Scanner scanner = new Scanner(System.in);
        boolean w = true;
        while (w) {

            for(int u =0;u<42;u++){

                System.out.print("Entrez une valeur : ");
                int colonneJoueur1 = scanner.nextInt();
                joueur1(lignes, colonneJoueur1,recupligne);
                execTab(ligne1,ligne2,ligne3,ligne4,ligne5,ligne6);

                //Rajout joueur 2 plus modif tout en bas de colonneJoueur1 en nombreEnti changer les valeurs;

                System.out.print("Entrez une valeur : ");
                int colonneJoueur2 = scanner.nextInt();
                joueur2(lignes, colonneJoueur2 ,recupligne);
                execTab(ligne1,ligne2,ligne3,ligne4,ligne5,ligne6);

                if(colonneJoueur1 == 10){
                    w = false;
                }

            }

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

    public static void joueur1(String[][] lignes,int colonneJoueur1, int recupligne) throws Exception {
        for (int i = 5; i >= 0; i--) {  
            if(lignes[i][colonneJoueur1] == " " && lignes[i][colonneJoueur1] != "@" && lignes[i][colonneJoueur1] != "="){
                lignes[i][colonneJoueur1] = "@";
                recupligne = i;
                detectWin1(lignes, colonneJoueur1, recupligne);

                break;
            }
        }
    }

    public static void joueur2(String[][] lignes,int colonneJoueur2,int recupligne) throws Exception{
        for (int a = 5; a > 0; a--) {
            if(lignes[a][colonneJoueur2] == " " && lignes[a][colonneJoueur2] != "@" && lignes[a][colonneJoueur2] != "="){
                lignes[a][colonneJoueur2] = "=";
                recupligne = a;
                // detectWin(lignes, colonneJoueur2, recupligne);
                break;
            }
        }
    }

//--------------------------------------

    public static void detectWin1(String[][]lignes, int colonneJoueur1,int recupligne)throws Exception{

        String symbole = lignes[recupligne][colonneJoueur1];

        String midDroite = lignes[recupligne][colonneJoueur1+1];
        System.out.println(recupligne);
        System.out.println(colonneJoueur1);

        if(recupligne >2 && colonneJoueur1 <=3){

            for(int v = 1;v<3;v++){
                
                if(midDroite == symbole){
                    
                }

            }


        }




















        
        // String diagHautGauche = lignes[recupligne-1][colonneJoueur1-1];
        // String diagHautDroite = lignes[recupligne-1][colonneJoueur1+1];


        // String midGauche = lignes[recupligne][colonneJoueur1-1];


        
        // String diagBasGauche = lignes[recupligne+1][colonneJoueur1-1];
        // String badMid = lignes[recupligne+1][colonneJoueur1];
        // String diagBasDroite = lignes[recupligne+1][colonneJoueur1+1];

        
}}






/*
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

*/




