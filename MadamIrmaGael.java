import java.util.ArrayList;

public class MadamIrmaGael {
    public static int numeroDeLaChance(String prenom) {
        int output = 0;
        prenom = prenom.toLowerCase();
        for (int i = 0; i < prenom.length(); i++) {
            output += (int) prenom.charAt(i);
        }
        return output % 50;
    }

    /*
     * 
     * 0-12 ans ecole
     * 12-20 ans trucs d'ados
     * 20-60 ans travail
     * 20-40 ans enfants
     * 20-30 ans conjoint
     * 60+ la retraite
     * 
     */

    public static ArrayList<String> preoccupations(int age) {
        ArrayList<String> preoclist = new ArrayList<String>();
        if (age >= 0 && age <= 12) {
            	preoclist.add("ecole");
        }
        else if ( age < 20 )
        	preoclist.add("trucs d'ados");
        else if ( age < 60 )
        {
		preoclist.add("travail" );
		
		if (age <= 40) {
		    preoclist.add("enfants");
		}
		if ( age <= 30) {
		    preoclist.add("conjoint");
		}
	}
	else
	    preoclist.add("retraite");

        return preoclist;
    }

    public static void main(String[] args) {
        String prenom = "Gertrude";
        int age = 25;
        int numDeChance = numeroDeLaChance(prenom);
        System.out.println(String.format("le numéro de la chance de %s est %d", prenom, numDeChance));
        ArrayList<String> preocs = preoccupations(age);
        System.out.println(String.format("vos préoccupations sont: %s", String.join(", ", preocs)));
    }
}