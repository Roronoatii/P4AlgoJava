import java.text.BreakIterator;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;





public class App {

    static boolean win = false;
    
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
        playerInput(lignes, ligne6, ligne6, ligne6, ligne6, ligne6, ligne6);
    }
    
    public static void playerInput(String[][] lignes,
    String[] ligne1,String[] ligne2,String[] ligne3,String[] ligne4,String[] ligne5,String[] ligne6) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int playerTurn = 1;
        while (win == false) {
            if(playerTurn==1){
                System.out.print("Player 1, entrez une valeur : ");
                int nombreEntier = scanner.nextInt()-1;
                if (nombreEntier < 0 || nombreEntier > 6){
                    System.out.println("Enter a valid number");
                }else{
                    joueur1(lignes, nombreEntier);
                    execTab(ligne1,ligne2,ligne3,ligne4,ligne5,ligne6);
                    playerTurn = 2;
                }
            }
            else if (playerTurn == 2){      
                System.out.print("Player 2, entrez une valeur : ");
                int nombreEntie = scanner.nextInt()-1;
                if (nombreEntie < 0 || nombreEntie > 6){
                    System.out.println("Enter a valid number");
                }else {
                    joueur2(lignes, nombreEntie);
                    execTab(ligne1,ligne2,ligne3,ligne4,ligne5,ligne6);
                    playerTurn = 1;
                }
            }
        }
    }


    public static void execTab(String[] ligne1,String[] ligne2,String[] ligne3,String[] ligne4,String[] ligne5,String[] ligne6) {
        System.out.println("|" + ligne1[0] + "|" + ligne1[1] + "|" + ligne1[2] + "|" + ligne1[3] + "|" + ligne1[4] + "|" + ligne1[5] + "|" + ligne1[6] + "|");
        System.out.println("|" + ligne2[0] + "|" + ligne2[1] + "|" + ligne2[2] + "|" + ligne2[3] + "|" + ligne2[4] + "|" + ligne2[5] + "|" + ligne2[6] + "|");
        System.out.println("|" + ligne3[0] + "|" + ligne3[1] + "|" + ligne3[2] + "|" + ligne3[3] + "|" + ligne3[4] + "|" + ligne3[5] + "|" + ligne3[6] + "|");
        System.out.println("|" + ligne4[0] + "|" + ligne4[1] + "|" + ligne4[2] + "|" + ligne4[3] + "|" + ligne4[4] + "|" + ligne4[5] + "|" + ligne4[6] + "|");
        System.out.println("|" + ligne5[0] + "|" + ligne5[1] + "|" + ligne5[2] + "|" + ligne5[3] + "|" + ligne5[4] + "|" + ligne5[5] + "|" + ligne5[6] + "|");
        System.out.println("|" + ligne6[0] + "|" + ligne6[1] + "|" + ligne6[2] + "|" + ligne6[3] + "|" + ligne6[4] + "|" + ligne6[5] + "|" + ligne6[6] + "|");
        }
    

    public static void joueur1(String[][] lignes,int nombreEntier) throws Exception {
        for (int i = 5; i >= 0; i--) {  
            if(lignes[i][nombreEntier] == " " && lignes[i][nombreEntier] != "@" && lignes[i][nombreEntier] != "="){
                
                lignes[i][nombreEntier] = "@";
                int recupligne = i;
                detectWin(lignes, nombreEntier, recupligne);
                break;
            }
        }
    }

    public static void joueur2(String[][] lignes,int nombreEntie) throws Exception{
        for (int a = 5; a >= 0; a--) {
            if(lignes[a][nombreEntie] == " " && lignes[a][nombreEntie] != "@" && lignes[a][nombreEntie] != "="){
                lignes[a][nombreEntie] = "=";
                int recupligne = a;
                detectWin(lignes, nombreEntie, recupligne);
                break;
            }
        }
    }

//--------------------------------------

    public static void detectWin(String[][]lignes, int nombreEntier,int recupligne)throws Exception{
        int checkWinExistance = 0;
        String caseCheck = lignes[recupligne][nombreEntier];
        String counterWin;
        // String diagHautGauche = lignes[recupligne-1][nombreEntier-1];
        // String diagHautDroite = lignes[recupligne-1][nombreEntier+1];
        // String midGauche = lignes[recupligne][nombreEntier-1];
        // String diagBasGauche = lignes[recupligne+1][nombreEntier-1];
        // String badMid = lignes[recupligne+1][nombreEntier];
        // String diagBasDroite = lignes[recupligne+1][nombreEntier+1];

        if(nombreEntier !=6){

            String midDroite = lignes[recupligne][nombreEntier+1+checkWinExistance];

            if (recupligne > 2 && nombreEntier < 4){
            
                for(int v =0 ;v<3;v++){
                    checkWinExistance++;
                    if(midDroite == caseCheck){
                        System.out.println("Vous avez gagné !");
                        win = true;
                        return;
                    }
    
                }
                System.out.println(midDroite);
            }

        }


            
            
            
    }
        //bas droite grille
        // if (recupligne >= 3 && nombreEntier >= 3){


        // }
        //haut gauche grille
        // if (recupligne <= 2 && nombreEntier <= 3){

        // }
        //haut droit grille
        // if (recupligne <= 2 && nombreEntier >= 3){

        // }
        
            


                // for(int c=1;c<3;c++){

                //     if(diagHautGauche == caseCheck){

                //         diagHautGauche = lignes[recupligne-1-c][nombreEntier-1-c];
                        
                //         if(c == 3){
                //             System.out.println("Victoire de"+caseCheck);
                //         }
                //     }else{

                        
                //         break;
                //     }

                // }
            

        
}






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




