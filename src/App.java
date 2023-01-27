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

        String[] ligneSuperStarStart =  {"*","*","*","*","*","*","*","*","*"};
        String[] ligne1 =               {"*"," "," "," "," "," "," "," ","*"};
        String[] ligne2 =               {"*"," "," "," "," "," "," "," ","*"};
        String[] ligne3 =               {"*"," "," "," "," "," "," "," ","*"};
        String[] ligne4 =               {"*"," "," "," "," "," "," "," ","*"};
        String[] ligne5 =               {"*"," "," "," "," "," "," "," ","*"};
        String[] ligne6 =               {"*"," "," "," "," "," "," "," ","*"};
        String[] ligneSuperEnd =        {"*","*","*","*","*","*","*","*","*"};

        String[][] lignes = {ligneSuperStarStart,ligne1, ligne2, ligne3, ligne4, ligne5, ligne6,ligneSuperEnd};
        execTab(ligneSuperStarStart,ligne1,ligne2,ligne3,ligne4,ligne5,ligne6,ligneSuperEnd);

        int recupligne = 1000;

        Scanner scanner = new Scanner(System.in);
        boolean w = true;
        while (w) {

            for(int u =0;u<42;u++){

                System.out.print("Entrez une valeur : ");
                int colonneJoueur1 = scanner.nextInt();
                joueur1(lignes, colonneJoueur1,recupligne);
                execTab(ligneSuperStarStart,ligne1,ligne2,ligne3,ligne4,ligne5,ligne6,ligneSuperEnd);

                //Rajout joueur 2 plus modif tout en bas de colonneJoueur1 en nombreEnti changer les valeurs;

                System.out.print("Entrez une valeur : ");
                int colonneJoueur2 = scanner.nextInt();
                joueur2(lignes, colonneJoueur2 ,recupligne);
                execTab(ligneSuperStarStart,ligne1,ligne2,ligne3,ligne4,ligne5,ligne6,ligneSuperEnd);

                if(colonneJoueur1 == 10){
                    w = false;
                }

            }

        }
        scanner.close();
        System.out.println("Done");
    }

    public static void execTab(String[] ligneSuperStarStart,String[] ligne1, String[] ligne2, String[] ligne3, String[] ligne4, String[] ligne5, String[] ligne6,String[] ligneSuperEnd) {
        

        System.out.println(Arrays.toString(ligneSuperStarStart));
        System.out.println(Arrays.toString(ligne1));
        System.out.println(Arrays.toString(ligne2));
        System.out.println(Arrays.toString(ligne3));
        System.out.println(Arrays.toString(ligne4));
        System.out.println(Arrays.toString(ligne5));
        System.out.println(Arrays.toString(ligne6));
        System.out.println(Arrays.toString(ligneSuperEnd));
    }

    public static void joueur1(String[][] lignes,int colonneJoueur1, int recupligne) throws Exception {
        for (int i = 7; i >= 0; i--) {  
            if(lignes[i][colonneJoueur1] == " " && lignes[i][colonneJoueur1] != "@" && lignes[i][colonneJoueur1] != "="){
                lignes[i][colonneJoueur1] = "@";
                recupligne = i;
                detectWin1(lignes, colonneJoueur1, recupligne);

                break;
            }
        }
    }

    public static void joueur2(String[][] lignes,int colonneJoueur2,int recupligne){
        for (int a = 7; a > 0; a--) {
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


        int numberOfCheck =0;
        int nombreALaSuite =1;
        
        // String diagHautDroite = lignes[recupligne-1+(-numberOfCheck)][colonneJoueur1+1+(numberOfCheck)];

        if(recupligne >3 && colonneJoueur1 <=4){

            for(int check =1;check<7;check++){

                if(lignes[recupligne][check].equals(symbole)){

                    for(int v = 0;v<3;v++){
                    
                        // System.out.println(numberOfCheck);
                        // System.out.println(nombreALaSuite);

                        String midDroite = lignes[recupligne][colonneJoueur1+1+(numberOfCheck)];
                        if(midDroite.equals(symbole)){

                            nombreALaSuite++;

                            if(nombreALaSuite == 3){
                                System.out.println("Vous avez gagné!");
                                break;
                            }
                            numberOfCheck++;
                            
                        }
                    }

                    numberOfCheck =0;
                    nombreALaSuite =1;

                }

            }



            // for(int v = 0;v<3;v++){

            //     if(diagHautDroite == symbole){

            //         nombreALaSuite++;

            //         System.out.println(diagHautDroite);

            //         if(nombreALaSuite == 4){
            //             System.out.println("Vous avez gagné!");
            //             break;
            //         }

            //         numberOfCheck++;
            //     }
            // }

            // numberOfCheck =0;
            // nombreALaSuite =1;

        }
    }
    }









