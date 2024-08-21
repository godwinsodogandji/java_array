import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.Scanner;
import java.util.HashSet;

public class MyList {

    public static void main(String[] args) {
        // Création d'un ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Exercice 1 : Trier un tableau d'entier
        int[] tableau = { 5, 1, 6, 8, 10 };
        Arrays.sort(tableau);
        System.out.println(Arrays.toString(tableau));
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
        // Autre méthode
        // Utilisation de la méthode scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter un nombre");
        int target = scanner.nextInt();
        int index = Arrays.binarySearch(tableau3, target);
        String resultat = (index < 0) ? "Le nombre n'existe pas dans le tableau"
                : "Le nombre existe à l'index " + index;
        System.out.println(resultat);

        // System.out.println(Arrays.binarySearch(tableau3, 7));

        // Exercice 5: Supprimer les doublons d'un tableau
        int[] doublons = { 1, 2, 2, 3, 4, 4, 5 };
        Set<Integer> uniqueVal = new HashSet<>();
        for (int item : doublons) {
            uniqueVal.add(item);

        }
        System.out.println("Le tableau des valeurs uniques est : " + uniqueVal);

    }

}
