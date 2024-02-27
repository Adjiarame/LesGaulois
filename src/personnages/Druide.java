package personnages;

import java.util.Random;

public class Druide extends Gaulois {
    private int dosesPotionMagique;

    public Druide(String nom) {
        super(nom, 0); // La force n'est pas utilisée pour les druides
    }

    public void fabriquerPotionMagique() {
        dosesPotionMagique = 3; // Nombre fixe de doses pour l'exemple
        System.out.println("Le gaulois " + nom + " : \"J'ai concocté " + dosesPotionMagique + " doses de potion magique. Elle a une force de " + calculerForcePotion() + ".\"");
    }

    private int calculerForcePotion() {
        return dosesPotionMagique; // La force de la potion est égale au nombre de doses
    }
}
