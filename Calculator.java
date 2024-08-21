public class Calculator {
    // Exercice4 : Méthode de Surcharge
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(multiply(3, 4));
        System.out.println(multiply(3.5, 4.2));

    }
}
