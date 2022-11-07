
class ConditionTwo {
    // Xavier


    public static void main(String[] args) {

        String nom = "toto";
        int age = 19;

        if ( age >= 18 )
            System.out.println( "majeur" );
        else
            System.out.println( "mineur" );

        System.out.println( "---------------------------------------");

        if ( age >= 18 )
            System.out.println( "majeur" );
        else if ( age < 16 )
            System.out.println( "à l'école" );
        else
            System.out.println( "mineur" );

        System.out.println( "---------------------------------------");

        String etat = "vide";

        if ( etat == "vide" )
            System.out.println( "je ne me baigne pas");
        else 
            System.out.println( "à l'eau !");
            System.out.println( "---------------------------------------");

        if ( etat != "vide" )
            System.out.println( "à l'eau !");
        else 
            System.out.println( "je ne me baigne pas");
            System.out.println( "---------------------------------------");

            nom = "Tata";
            age = 15;
            nom = nom.toLowerCase();
 
            if (age < 18) {
                    if (age < 16 && !nom.equals( "toto") ) { 
                            System.out.println(String.format("%s va a la petite ecole", nom));
                    }
                    System.out.println(String.format("%s est mineur", nom));
            } else
                    System.out.println(String.format("%s est majeur", nom));


/*
 * 
 *               !   ->  not (inverse l'état du booleen)
 *              ==   ->  egal
 *              !=   ->  not egal
 *              >    ->  strictement superieur à 
 *              <    ->  strictement inférieur à 
 *              >=   ->  superieur ou égal à 
 *              <=   ->  inférieur ou égal à 
 * 
 *              &&   ->  and  et              
 *              ||   ->  or   ou           
 *              ^^   ->  xor  ou exclusif            
 */

            System.out.println( "---------------------------------------");

            nom = "toto";

            if ( !(nom != "toto") )
                System.out.println( "hello toto");
            else
                System.out.println( "hello !");
        }
}