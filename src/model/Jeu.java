// package model;


// import java.util.Scanner;

// public class Jeu {

//     // Met pion sur la grille
//     public void placerPion(Pion pion, int[][] grille) {
//         grille[pion.getLigne()][pion.getColonne()] = pion.getCouleur();
//     }

//     //Input pour mettre le pion sur la grille
//     public void inputPion(Pion pion, int[][] grille) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Choisissez une colonne pour placer votre pion");
//         int colonne = sc.nextInt();
//         pion.setColonne(colonne);
//         pion.setLigne(0);
//         placerPion(pion, grille);
//         sc.close();
//     }

//     //Condition de victoire
//     public boolean victoire(Pion pion, int[][] grille) {
//         int couleur = pion.getCouleur();
//         int ligne = pion.getLigne();
//         int colonne = pion.getColonne();
//         int compteur = 0;
//         //Condition de victoire horizontale
//         for (int i = 0; i < 7; i++) {
//             if (grille[ligne][i] == couleur) {
//                 compteur++;
//             } else {
//                 compteur = 0;
//             }
//             if (compteur == 4) {
//                 return true;
//             }
//         }
//         //Condition de victoire verticale
//         compteur = 0;
//         for (int i = 0; i < 6; i++) {
//             if (grille[i][colonne] == couleur) {
//                 compteur++;
//             } else {
//                 compteur = 0;
//             }
//             if (compteur == 4) {
//                 return true;
//             }
//         }
//         //Condition de victoire diagonale
//         compteur = 0;
//         for (int i = 0; i < 6; i++) {
//             for (int j = 0; j < 7; j++) {
//                 if (grille[i][j] == couleur) {
//                     compteur++;
//                 } else {
//                     compteur = 0;
//                 }
//                 if (compteur == 4) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

    
// }
