/*
  Titre      : tableau_aléatoire
  Auteur     : Cedric Yonta
  Date       : 20/10/2022
  Description: initialiser un tableau avec des valeurs aléatoire
  Version    : 0.0.1
*/

import java.util.Random;

public class plusGrandeValeure {
  public static void main(String[] args) throws Exception {
    
    
    int tab[] = new int[15];
    int max = 100;
    int min = 0;
    int numeroCellure = 0;
    int valeurSup = 0;
    int indexCellule = 0;


    Random rand = new Random();

    System.out.println("*******Affichage du tableau**********");

   
    for (int i = 0; i < tab.length; i++) {
      tab[i] = rand.nextInt(max - min + 1) + min;
      System.out.print("tableau [" + numeroCellure + "] = " + tab[i]);
      System.out.println();
      numeroCellure++;
    }


    for (int index = 0; index < tab.length; index++) {
      if (valeurSup < tab[index]) {
        valeurSup = tab[index];
        indexCellule = index;
      }

    }

    System.out.println();
    System.out.println(" Le plus grans nombre  du tableau est :" + valeurSup);
    System.out.println("Il est à l'index :" + indexCellule);

  }

}