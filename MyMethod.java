public class MyMethod {
    // Exercice1: Méthode de Calcul de la Somme
    public static int sum(int a, int b) {
        return a + b;
    }

    // Exercice2: Méthode de Vérification de Parité
    public static int isEvent(int number) {
        if (number % 2 == 0) {
            System.out.println("true");
        } else if (number % 2 != 0) {
            System.out.println("false");
        }
        return number;
    }

    // Exercice3 : Méthode de Calcul de la Factorielle

    // public static int factorial(int n) {
    // int factorial;
    // factorial = 1;
    // for (int i; i <= 0; i++) {

    // factorial *= i;
    // }
    // // return
    // return factorial;
    // }

    // Exercice 5 : Méthode de Manipulation de Chaînes
    // public static String reverseString(String str){

    // }
    public static void main(String[] args) {
        System.out.println(sum(5, 7));
        System.out.println(isEvent(5));
        // System.out.println(factorial(5));

    }

}
