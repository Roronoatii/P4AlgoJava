import java.util.Arrays;
import java.util.Scanner;

public class App {


    public static void main(String[] args) throws Exception {

        int[] ligne1 = {0,0,0,0,0,0,0};
        int[] ligne2 = {0,0,0,0,0,0,0};
        int[] ligne3 = {0,0,0,0,0,0,0};
        int[] ligne4 = {0,0,0,0,0,0,0};
        int[] ligne5 = {0,0,0,0,0,0,0};
        int[] ligne6 = {0,0,0,0,0,0,0};

        int[][] lignes = {ligne1, ligne2, ligne3, ligne4, ligne5, ligne6};

        execTab(ligne1,ligne2,ligne3,ligne4,ligne5,ligne6);


        Scanner scanner = new Scanner(System.in);
        boolean w = true;
        int nombreCase =0;
        while (w) {

            

            for(int u =0;u<42;u++){

                System.out.print("Entrez une valeur : ");
                int nombreEntier = scanner.nextInt();
                joueur1(lignes, nombreEntier);
                execTab(ligne1,ligne2,ligne3,ligne4,ligne5,ligne6);
                nombreCase++;

                //Rajout joueur 2 plus modif tout en bas de nombreEntier en nombreEnti changer les valeurs;

                System.out.print("Entrez une valeur : ");
                int nombreEntie = scanner.nextInt();
                joueur2(lignes, nombreEntie);
                execTab(ligne1,ligne2,ligne3,ligne4,ligne5,ligne6);
                nombreCase++;

                if( nombreCase >= 42){
                    System.out.println("Personne n'a gagné ! ");
                    w = false;
                    break;
                    
                }

            }
            

        }

        
        scanner.close();
        
        
        // Scanner scanner = new Scanner(System.in);

        // scanner = new Scanner(System.in);
        // System.out.print("Entrez un nombre entier : ");
        // int nombreEntier = scanner.nextInt();
        // scanner.close();
        
        // for (int i = 5; i > 0; i--) {
            
        //     if(lignes[i][nombreEntier] == 0 && lignes[i][nombreEntier] != 1 && lignes[i][nombreEntier] != 2){
        //         lignes[i][nombreEntier] = 1;
                
        //         break;
                
        //     }
        // }



        // for(int y =0 ;y<4;y++){
        // }

            // joueur1(lignes);
            // execTab(ligne1,ligne2,ligne3,ligne4,ligne5,ligne6);

            // joueur1(lignes);
            // execTab(ligne1,ligne2,ligne3,ligne4,ligne5,ligne6);

        

        // joueur1(lignes);

        // execTab(ligne1,ligne2,ligne3,ligne4,ligne5,ligne6);

       
        // Fonction d'un tour 1er joueur

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Entrez un nombre entier : ");
        // int nombreEntier = sc.nextInt();
        // sc.close();
        
        // for (int i = 5; i > 0; i--) {
            
        //     if(lignes[i][nombreEntier] == 0 && lignes[i][nombreEntier] != 1 && lignes[i][nombreEntier] != 2){
        //         lignes[i][nombreEntier] = 1;
                
        //         break;
                
        //     }
        // }

        // execTab(ligne1,ligne2,ligne3,ligne4,ligne5,ligne6);

        // Execute 2eme joueur

        // Scanner sca = new Scanner(System.in);
        // System.out.print("Entrez un nombre entier : ");
        // int nombreEntier2 = sca.nextInt();
        

        
        // for (int a = 5; a > 0; a--) {
            
        //     if(lignes[a][nombreEntier] == 0 && lignes[a][nombreEntier] != 1 && lignes[a][nombreEntier] != 2){
        //         lignes[a][nombreEntier2] = 2;
        //         sca.close();
        //         break;
        //     }
        // }

        // execTab(ligne1,ligne2,ligne3,ligne4,ligne5,ligne6);

    }


    public static void execTab(int[] ligne1, int[] ligne2, int[] ligne3, int[] ligne4, int[] ligne5, int[] ligne6) {
        System.out.println(Arrays.toString(ligne1));
        System.out.println(Arrays.toString(ligne2));
        System.out.println(Arrays.toString(ligne3));
        System.out.println(Arrays.toString(ligne4));
        System.out.println(Arrays.toString(ligne5));
        System.out.println(Arrays.toString(ligne6));
    }

    public static void joueur1(int[][] lignes,int nombreEntier) {

        for (int i = 5; i > -1; i--) {
            
            if(lignes[i][nombreEntier] == 0 && lignes[i][nombreEntier] != 1 && lignes[i][nombreEntier] != 2){
                lignes[i][nombreEntier] = 1;
                
                
                break;
                
            }else{
                System.out.println("Dommage tu n'avais qu'a mieux regarder tu passes ton tour !");
            }
        }
        
    }

    public static void joueur2(int[][] lignes,int nombreEntie) {

        for (int a = 5; a > -1; a--) {
            
            
            if(lignes[a][nombreEntie] == 0 && lignes[a][nombreEntie] != 1 && lignes[a][nombreEntie] != 2){
                lignes[a][nombreEntie] = 2;
                
                break;
                
            }else{
                System.out.println("Dommage tu n'avais qu'a mieux regarder tu passes ton tour !");
            }
        }
        
    }

}

