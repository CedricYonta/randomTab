/*
  Titre      : tableau_aléatoire
  Auteur     : Cedric Yonta
  Date       : 20/10/2022
  Description: initialiser un tableau avec des valeurs aléatoire
  Version    : 0.0.1
*/

import java.util.Random;// importation de l'outil Random

public class plusGrandeValeure {
  public static void main(String[] args) throws Exception {
    
    // declarations des variables
    int tab[] = new int[15];
    int max = 100;
    int min = 0;
    int numeroCellure = 0;
    int valeurSup = 0;
    int indexCellule = 0;

     
    Random rand = new Random();//creation de l'instace de type Random

    System.out.println("*******Affichage du tableau**********");

   // les valeurs issus de la fontionnalité random seront envoyer dans chaque cellule du tableau
    for (int i = 0; i < tab.length; i++) {
      tab[i] = rand.nextInt(max - min + 1) + min;
      System.out.print("tableau [" + numeroCellure + "] = " + tab[i]);
      System.out.println();
      numeroCellure++;
    }

    // recherche de la cellule ayant la plus grande valeure et son index en comparant chaque cellule du tableau
    for (int index = 0; index < tab.length; index++) {
      if (valeurSup < tab[index]) {
        valeurSup = tab[index];
        indexCellule = index;
      }

    }

    // affichage du resultat
    System.out.println();
    System.out.println(" Le plus grans nombre  du tableau est :" + valeurSup);
    System.out.println("Il est à l'index :" + indexCellule);

  }

}

