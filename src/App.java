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
                
            }
        }
        
    }

    public static void joueur2(int[][] lignes,int nombreEntier) {

        for (int a = 5; a > 0; a--) {
            
            if(lignes[a][nombreEntier] == 0 && lignes[a][nombreEntier] != 1 && lignes[a][nombreEntier] != 2){
                lignes[a][nombreEntier] = 2;
                
                break;
                
            }
        }
        
    }






}

