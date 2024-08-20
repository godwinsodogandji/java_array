import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class MyList {

    public static void main(String[] args) {
        // Création d'un ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Exercice 1 : Trier un tableau d'entier
        int[] tableau = { 5, 1, 6, 8, 10 };
        Arrays.sort(tableau);
        for (int el : tableau) {
            System.out.println(el);
        }

        // Exercice 2 : Filtrer les éléments pairs d'un tableau
        int[] tableau1 = { 1, 2, 3, 4, 5, 6 };

        for (int i = 0; i < tableau1.length; i += 1) {
            if (tableau1[i] % 2 == 0) {

                System.out.println(tableau1[i]);
            }

        }
        // Exercice 3: Trouver le maximum et le minimum d'un tableau
        int[] tableau2 = { 3, 5, 7, 2, 8 };
        int min = tableau2[0];
        int max = tableau2.length;
        for (int element : tableau2) {
            if (min > element) {
                min = element;

            }

            if (max < element) {
                max = element;

            }

        }
        System.out.println("La valeur min est: " + min);
        System.out.println("La valeur max est: " + max);

        // Exercice 4: Rechercher un élément dans un tableau trié
        int[] tableau3 = { 1, 3, 5, 7, 9 };

        
        System.out.println(Arrays.binarySearch(tableau3, 7));
        
        // Exercice 5: Supprimer les doublons d'un tableau
        int[] tableau4 = {1, 2, 2, 3, 4, 4, 5};
        
        
    }

   
}
