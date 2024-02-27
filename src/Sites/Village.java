package Sites;

import personnages.Gaulois;

public class Village {
    private Gaulois chef;
    private Gaulois[] habitants = new Gaulois[50];
    private int nbHabitants = 0;

    public Village(Gaulois chef) {
        this.chef = chef;
        System.out.println("Le gaulois " + chef.getNom() + " : \"Je suis un grand guerrier et je vais créer mon village\".");
    }

    public void ajouterGaulois(Gaulois gaulois) {
        if (nbHabitants < 50) {
            habitants[nbHabitants++] = gaulois;
            System.out.println("Bienvenue " + gaulois.getNom() + " !");
        } else {
            System.out.println("Désolé " + gaulois.getNom() + ", mon village est déjà bien rempli.");
        }
    }

    public void afficherVillage() {
        System.out.println("Le village de " + chef.getNom() + " est habité par :");
        for (int i = 0; i < nbHabitants; i++) {
            System.out.println("- " + habitants[i].getNom());
        }
    }

    public void changerChef(Gaulois nouveauChef) {
        System.out.println("Le gaulois " + chef.getNom() + " quitte le village.");
        chef = nouveauChef;
        System.out.println("Le gaulois " + nouveauChef.getNom() + " prend la direction du village.");
    }

    public Gaulois getChef() {
        return chef;
    }
}
