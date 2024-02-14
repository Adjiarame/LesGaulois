package personnages;

public class Romain extends Personnage {
    public Romain(String nom, int force) {
        super(nom, force);
    }

    @Override
    public String donnerAuteur() {
        return "Romain";
    }

    public void frapper(Gaulois asterix) {
        System.out.println("Le Romain " + nom + " donne un grand coup au " + asterix + " " + asterix + ".");
        int forceCoup = this.force / 3;
        asterix(forceCoup);
    }

	private void asterix(int forceCoup) {
		// TODO Auto-generated method stub
		
	}
}

