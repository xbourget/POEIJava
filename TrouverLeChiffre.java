import java.util.Scanner; // Import the Scanner class
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


class TrouverLeChiffre {
    // Xavier


    public static void jeu()
    {
        // init du jeu
        int nombreADecouvrir = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        int essaie = 0;
        int chiffreChoisi=0;
        while( true )
        {
            System.out.print("entrez un chiffre entr 1 et 10 : ");
            String textSaisi = saisie.nextLine(); 
            try
            {
                chiffreChoisi = Integer.parseInt(textSaisi); 
            }
            catch( NumberFormatException nfe )
            {
                System.out.println("vous devez saisir un chiffre entre ente 1 et 10.");
                continue;
            }

            if( chiffreChoisi > nombreADecouvrir )
                System.out.println("trop grand !");
            else if( chiffreChoisi < nombreADecouvrir )
                System.out.println("trop petit !");
            else 
            {
                System.out.println("gagné !");
                break;
            }
           
            if ( ++essaie >= 5 )
            {
                System.out.println("nombre d'essaie épuisé !");
                break;
            }
        }
    }


    public static void multiPartie()
    {
        ArrayList<String> reponseY = new ArrayList<String>(Arrays.asList( "yes", "y", "o", "si", "ye", "oui", "ou", "da" ));
        while( true )
        {
            jeu();
            System.out.print( "voulez-vous continuer ? ");
            String reponse = saisie.nextLine().toLowerCase();
            if ( reponseY.indexOf( reponse ) == -1 )
                break;
        }
    }

    static public Scanner saisie;

    public static void main(String[] args) {

        saisie = new Scanner(System.in); // Create a Scanner object sur l'entrée standard alias le clavier alias
        Random rand = new Random();

        multiPartie();
        
        saisie.close();
    }
}