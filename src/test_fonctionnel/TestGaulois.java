package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 8);
        Romain minus = new Romain("Minus", 6);

        asterix.parler("Bonjour à tous");
        minus.parler("UN GAU... UN GAUGAU...");

        
        System.out.println("Astérix frappe Minus :");
        asterix.frapper(minus);
        minus.parler("Aïe");

 
        System.out.println("Minus frappe Astérix :");
        minus.frapper(asterix);
        asterix.parler("Aïe");

        
        System.out.println("Astérix frappe Minus à nouveau :");
        asterix.frapper(minus);
        minus.parler("Aïe");

        
        System.out.println("Minus frappe Astérix à nouveau :");
        minus.frapper(asterix);
        asterix.parler("Aïe");

        
        System.out.println("Astérix frappe Minus pour la dernière fois :");
        asterix.frapper(minus);
        minus.parler("J’abandonne...");
    }
}
