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
                    singleplayerMenu();
                    //grid(args);
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
        System.out.println("1. Singleplayer");
        System.out.println("2. Multiplayer");
        System.out.println("3. Display Top 10");
        System.out.println("4. Exit");
    }
    public static void singleplayerMenu(){
        System.out.println("---Singleplayer---");
        System.out.println("");
    }
    public static void multiplayerMenu(){
        System.out.println("---Multiplayer---");
        String joueur = Scanner.
        System.out.println("");
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
                while(true){
                    System.out.print("Joueur 1, Entrez une valeur : ");
                    if(scanner.hasNextInt()){
                        int colonneJoueur1 = scanner.nextInt()-1;
                        if (colonneJoueur1 < 0 || colonneJoueur1 > 6){
                            System.out.println("Entre un chiffre entre 1 et 7");
                        }else{
                            joueur1(lignes, colonneJoueur1,recupligne);
                            execTab(ligne1,ligne2,ligne3,ligne4,ligne5,ligne6);
                            break;
                        }
                    } else {
                        System.out.println("Entre un chiffre valide : ");
                        scanner.next();
                    }
                }
                while(true){
                    //Rajout joueur 2 plus modif tout en bas de colonneJoueur1 en nombreEnti changer les valeurs;
                    System.out.print("Joueur 2, Entrez une valeur : ");
                    if (scanner.hasNextInt()){
                        int colonneJoueur2 = scanner.nextInt()-1;
                        if (colonneJoueur2 < 0 || colonneJoueur2 > 6){
                            System.out.println("Entre un chiffre entre 1 et 7");
                        }else{
                            joueur2(lignes, colonneJoueur2 ,recupligne);
                            execTab(ligne1,ligne2,ligne3,ligne4,ligne5,ligne6);
                            break;
                        }
                    }else{
                        System.out.println("Entre un chiffre valide : ");
                        scanner.next();
                    }
                }
            }
        }
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
                detectWin2(lignes, colonneJoueur2, recupligne);
                break;
            }
        }
    }

//--------------------------------------

    public static void detectWin1(String[][]lignes, int colonneJoueur1,int recupligne)throws Exception{

        String symbole = lignes[recupligne][colonneJoueur1];

        int numberOfCheck =0;

        int nombreALaSuite =1;

        String midDroite = lignes[recupligne][colonneJoueur1+1+(numberOfCheck)];

        if(recupligne >2 && colonneJoueur1 <=3){

            for(int v = 0;v<3;v++){
                
                if(midDroite == symbole){

                    nombreALaSuite++;

                    if(nombreALaSuite == 4){
                        System.out.println("Vous avez gagné!");
                        break;
                    }

                    numberOfCheck++;
                }
            }

            numberOfCheck =0;
            nombreALaSuite =1;


        }
        public static void detectWin2(String[][]lignes, int colonneJoueur2,int recupligne)throws Exception{

            String symbole = lignes[recupligne][colonneJoueur2];
    
            int numberOfCheck =0;
    
            int nombreALaSuite =1;
    
            String midDroite = lignes[recupligne][colonneJoueur2+1+(numberOfCheck)];
    
            if(recupligne >2 && colonneJoueur2 <=3){
    
                for(int v = 0;v<3;v++){
                    
                    if(midDroite == symbole){
    
                        nombreALaSuite++;
    
                        if(nombreALaSuite == 4){
                            System.out.println("Vous avez gagné!");
                            break;
                        }
    
                        numberOfCheck++;
                    }
                }
    
                numberOfCheck =0;
                nombreALaSuite =1;
    
    
            }
        
        // String diagHautGauche = lignes[recupligne-1][colonneJoueur1-1];
        // String diagHautDroite = lignes[recupligne-1][colonneJoueur1+1];


        // String midGauche = lignes[recupligne][colonneJoueur1-1];


        
        // String diagBasGauche = lignes[recupligne+1][colonneJoueur1-1];
        // String badMid = lignes[recupligne+1][colonneJoueur1];
        // String diagBasDroite = lignes[recupligne+1][colonneJoueur1+1];

        
    }
}


