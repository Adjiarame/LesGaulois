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
        System.out.println("Le " + donnerAuteur() + " " + nom + " donne un grand coup au " + adversaire.donnerAuteur() + " " + adversaire.getNom() + ".");
        int forceCoup = this.force / 3;
        adversaire.recevoirCoup(forceCoup);
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
