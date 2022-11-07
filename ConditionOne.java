import java.util.HashMap;
import java.util.Map;

public class ConditionOne {

    public static String quelSportFait1( String nom  )
    {
        if ( nom == "toto" )
            return "tennis";
        if ( nom == "jean" )
            return "velo";
        if ( nom == "Sigismond" )
            return "joute";
        if ( nom == "Gontrand" )
            return "bridge";
        if ( nom == "titi" )
            return "ski";
        return "je ne sais pas";
    }

    public static String quelSportFait2( String nom  )
    {
        String resultat = "";

        if ( nom == "toto" )
            resultat = "tennis";
        else if ( nom == "jean" )
            resultat = "velo";
        else if ( nom == "Sigismond" )
            resultat = "joute";
        else if ( nom == "Gontrand" )
            resultat = "bridge";
        else if ( nom == "titi" )
            resultat = "ski";
        else 
            resultat = "je ne sais pas";

        return resultat;
    }

    public static String quelSportFait3( String nom  )
    {
        String sport = "";
        nom = nom.toLowerCase(); 

        switch (nom) {
            case "toto":
                sport = "tennis";
                break;

            case "jean":
            case "remi":
                sport = "vélo";
                break;

            case "sigismond":
                sport = "joute";
                break;

            case "gontrand":
                sport = "bridge";
                break;

            case "titi":
                sport = "ski";
                break;

            default:
                sport = "aucun sport";
                break;
        }
        return sport;    
    }

    public static String quelSportFait4( String nom  )
    {
        Map<String, String> sports = new HashMap<>();
 
        sports.put( "toto",         "velo" );
        sports.put( "titi",         "ski" );
        sports.put( "sigismond",    "joute" );
        sports.put( "valerie",      "judo" );
        sports.put( "felix",        "course" );
        sports.put( "toto",         "natation" );

        if ( sports.containsKey( nom ) )
            return sports.get( nom );
        else
            return "je ne sais pas";
    }



    public static void main(String[] args) {

        String nom = "toto";
        String sport = quelSportFait1( nom );

        System.out.println( String.format(" %s fait %s " , nom, sport ));

        nom = "Sigismond";
        sport = quelSportFait1( nom );
        System.out.println( String.format(" %s fait %s " , nom, sport ));

        nom = "Zorro";
        sport = quelSportFait1( nom );
        System.out.println( String.format(" %s fait %s " , nom, sport ));

    }
}


/*
    toto -> tennis
    jean -> velo
    Sigismond -> joute
    Gontrand  -> bridge
    titi -> ski 
 */
