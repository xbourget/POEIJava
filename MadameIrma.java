import java.util.ArrayList;

class  MadameIrma {
    // Xavier

    public static int numeroDeLaChance(  String  prenom )
    {
        prenom = prenom.toLowerCase();

        int resultat = 0;

        for( int i = 0 ; i < prenom.length() ; i++ )
        {
            int charactere  = prenom.charAt( i ) - (int)'a' + 1;  
            resultat += charactere;
        }
        return resultat % 50 ;
    }  

    public static String preoccupation( int age )
    {


    }


    public static void main(String[] args) {

        String prenom = "Gertrude";
        int numDeChance = numeroDeLaChance( prenom ); 
        System.out.println( String.format( "le numéro de la chance de %s est %d", prenom, numDeChance ));
    }
}
/*
 * 
 *  0-12  ans ecole
 *  12-20 ans trucs d'ados
 *  20-60 ans travail
 *  20-40 ans enfants
 *  20-30 ans conjoint
 *  60+   la retraite
 * 
 */







