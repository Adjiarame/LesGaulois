package Sites;

import personnages.Gaulois;
import personnages.Romain;

public class TestSites {
    public static void main(String[] args) {
        Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
        Village village = new Village(vercingetorix);

        Romain minus = new Romain("Minus", 2);
        Camp camp = new Camp(minus);

        // les gaulois au village
        Gaulois[] gaulois = {
            new Gaulois("Agecanonix", 1),
            new Gaulois("Assurancetourix", 2),
            new Gaulois("Astérix", 5),
            new Gaulois("Obelix", 15),
            new Gaulois("Prolix", 2)
        };

        for (Gaulois gaulois1 : gaulois) {
            village.ajouterGaulois(gaulois1);
        }

        //  les soldats du camp
        Romain[] romains = {
            new Romain("Brutus", 5),
            new Romain("Milexcus", 2),
            new Romain("Tullius Octopus", 2),
            new Romain("Ballondebaudrus", 3)
        };

        for (Romain romain : romains) {
            camp.ajouterSoldat(romain);
        }

       
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);

        
        Romain briseradius = new Romain("Briseradius", 4);
        Romain chorus = new Romain("Chorus", 4);

        
        System.out.println("Le gaulois Vercingétorix : « Je laisse mon grand bouclier au grand Abraracourcix ».");
        System.out.println("Le gaulois Abraracourcix : « Merci ! ».");

        System.out.println("Le romain Briseradius : « Je ne suis pas suffisamment gradé pour prendre la direction du camp romain. ».");
        System.out.println("Le romain Chorus : « Moi Chorus je prends la direction du camp romain. ».");
    }
}
