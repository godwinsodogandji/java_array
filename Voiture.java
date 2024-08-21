public class Voiture {
    // Declaration de variables
    String type = "Audi";
    String Model = "2019";
    int prix = 99580;
    String color;
    String prix1;
    String nom;

    public static String accelerer() {
        return "j'accelere";
    }

    public static String ralentir() {
        return "je ralentis";
    }

    public static String tourner() {
        return "je tourne";
    }

    public static String freiner() {
        return "je freine";
    }

    public static String rouler() {
        return "je roule";
    }

    // Creation de constructeur dans notre classe Voiture
    // Et pour l'affichage, lors de l'extensiation on met la valeur qu'on veut
    // donner dans la parenthèse
    public Voiture(String color, String prix1, String nom) {
        this.color = color;
        this.prix1 = prix1;
        this.nom = nom;
        System.out.println("color " + color + " avec un prix " + prix1);
    }

    // Methode des getters et des setters
    //Getters
    public String getNom(){
        return this.nom;
    }
    //Setters
    public void setNom(String nom){
        this.nom = nom;
    }



}
