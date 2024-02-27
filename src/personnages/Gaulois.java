package personnages;

public class Gaulois extends Personnage {
    public Gaulois(String nom, int force) {
        super(nom, force);
    }

    @Override
    public String donnerAuteur() {
        return "Gaulois";
    }

    @Override
    public void frapper(Personnage adversaire) {
        int forceFrappe = this.force / 2; // Calcul de la force de frappe (A voi)
        System.out.println("Le gaulois " + this.nom + " donne un coup de force " + forceFrappe + " au " + adversaire.donnerAuteur() + " " + adversaire.getNom() + ".");
     
        adversaire.recevoirCoup(forceFrappe);
    }
}
