package personnages;

public class Gaulois extends Personnage {
    public Gaulois(String nom, int force) {
        super(nom, force);
    }

    @Override
    public String donnerAuteur() {
        return "Gaulois";
    }

    public void frapper(Personnage adversaire) {
        System.out.println("Le Gaulois " + nom + " donne un grand coup au " + adversaire.donnerAuteur() + " " + adversaire.getNom() + ".");
        int forceCoup = this.force / 3;
        adversaire.recevoirCoup(forceCoup);
    }
}
