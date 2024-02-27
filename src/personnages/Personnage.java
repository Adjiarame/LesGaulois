package personnages;

public class Personnage {
    protected String nom;
    protected int force;

    public Personnage(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println("Le " + donnerAuteur() + " " + nom + " : \"" + texte + "\".");
    }

    public String donnerAuteur() {
        return "Personnage";
    }

    public void frapper(Personnage adversaire) {
        int forceFrappe = this.force / 2; // Calcul de la force de frappe mm chose
        System.out.println("Le " + donnerAuteur() + " " + nom + " donne un coup de force " + forceFrappe + " au " + adversaire.donnerAuteur() + " " + adversaire.getNom() + ".");
     
        adversaire.recevoirCoup(forceFrappe);
    }

    public void recevoirCoup(int forceCoup) {
        this.force -= forceCoup;
        if (this.force < 0) {
            this.force = 0;
        }
        if (this.force > 0) {
            System.out.println("Aïe !");
        } else {
            System.out.println("J'abandonne...");
        }
    }
}
