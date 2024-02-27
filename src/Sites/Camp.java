package Sites;

import personnages.Romain;

public class Camp {
    private Romain commandant;
    private Romain[] soldats = new Romain[80];
    private int nbSoldats = 0;

    public Camp(Romain commandant) {
        this.commandant = commandant;
        System.out.println("Le romain " + commandant.getNom() + " : \"Je suis en charge de créer un nouveau camp romain.\".");
    }

    public void ajouterSoldat(Romain soldat) {
        if (nbSoldats < 80) {
            soldats[nbSoldats++] = soldat;
            System.out.println("Le romain " + soldat.getNom() + " : \"Je mets mon épée au service de Rome dans le camp dirigé par " + commandant.getNom() + "\".");
        } else {
            System.out.println("Désolé " + soldat.getNom() + ", notre camp est complet !");
        }
    }

    public void afficherCamp() {
        System.out.println("Le camp dirigé par " + commandant.getNom() + " contient les soldats :");
        for (int i = 0; i < nbSoldats; i++) {
            System.out.println("- " + soldats[i].getNom());
        }
    }

    public void changerCommandant(Romain nouveauCommandant) {
        if (nouveauCommandant.getGrade().equals("CENTURION")) {
            System.out.println("Changement de commandant : " + commandant.getNom() + " cède le commandement à " + nouveauCommandant.getNom() + ".");
            commandant = nouveauCommandant;
        } else {
            System.out.println("Le romain " + nouveauCommandant.getNom() + " n'a pas le grade de centurion et ne peut pas prendre la direction du camp.");
        }
    }

    public Romain getCommandant() {
        return commandant;
    }
}
