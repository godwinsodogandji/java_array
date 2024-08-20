public class MyArray {

    public static void main(String[] args) {
        // Declaration de tableau
        // Assignation de valeur à un tableau
        // Initilisation un tableau
        // Parcours d'un tableau

        String[] code; // Declaration de la variable code

        char[] alphabet; // Declaration de la variable alphabet

        String[] fruits = new String[5]; // Declaration de la variable fruits et definition de la taille

        int[] number = { 12, 45, 85, 100 }; // Initialisation d'un tableau de nombre
        number[1] = 100;

        // System.out.println("Mon fruit à l'index 0 est: " + fruits[0]);
        // System.out.println("Mon fruit à l'index 3 est: " + fruits[1]);
        // System.out.println("Mon fruit à l'index 5 est: " + fruits[3]);

        // Ajout de fruits dans notre tableau fruit
        fruits[3] = " Pomme";
        fruits[0] = " Orange";
        fruits[1] = " Mangue";

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("L'element à l'index "+ i + fruits[i]);
        }
        for (String fruit : fruits) {
            System.out.println(fruit);
            
        }
        
        for (int i : number) {
            System.out.println(i);
            
        }

    }
}