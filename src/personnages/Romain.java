package personnages;

public class Romain extends Personnage {
    public Romain(String nom, int force) {
        super(nom, force);
    }

    @Override
    public String donnerAuteur() {
        return "Romain";
    }

    public void frapper(Gaulois gaulois) {
        int forceFrappe = this.force / 3; // Calcul de la force de frappe
        System.out.println("Le romain " + this.nom + " donne un coup de force " + forceFrappe + " au gaulois " + gaulois.getNom() + ".");
        gaulois.recevoirCoup(forceFrappe);
    }

	public Object getGrade() {
		// TODO Auto-generated method stub
		return null;
	}
}

