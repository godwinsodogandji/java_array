public class App {

    // Quand on met de static, on peut appeler directement la méthode dans le main
    static void nettoyage() {
        // System.out.println("nettoyage1");
    }
    // Mais quand on ne met pas de static on est obligé d'extensier la classe dans le main 
    public void nettoyage2() {
        // System.out.println("nettoyage2");
    }

    public static void main(String[] args) {
        Voiture voiture = new Voiture("rouge", "9000", "Toyota");
        // System.out.println(voiture.accelerer());
        // System.out.println(voiture.ralentir());
        // System.out.println(voiture.freiner());
        // System.out.println(voiture.tourner());
        // System.out.println(voiture.rouler());
        // nettoyage();
        App err = new App();
        err.nettoyage2();
        voiture.setNom("Mercedes");
        System.out.println(voiture.getNom());


    }

}
