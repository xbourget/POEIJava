
// encapsulé dans une class
// une class commence par une Majuscule 
class Variables {

    public static void main( String[] args ) {

        // déclaration d'un entier 
        int temperature = 19;   // 32 bit  0-4G
        //     LVALUE   =   RVALUE 
        int temperatures = 19;  // 32 bit  -2G à + +2G
        
        float temperaturePrecise = 19.14f; // 32 bit  0-4G
        double poidsDeTata = 56.4;          // 64 bit

        char unelettre = 'A';  // caractère stoké ur 2 byte (soit 16 bits)
        
        String maChaine = "Toto va à la pêche";

        int largeur = 45;
        double longueur = 56.5;
        //double surface = largeur * longueur;

        String c1 = "toto va";
        String c2 = " à la plage";

        System.out.println( "la temperature est : " + temperature );
        System.out.println( "la temperature est exactement : " + temperaturePrecise );
        System.out.println( "la temperature est exactement : " + temperaturePrecise );
        System.out.println( "le poids de Tata est  : " + poidsDeTata );
        System.out.println( "ma lettre  : " + unelettre );
        System.out.println( "ma chaine  : " + maChaine );
        System.out.println( "concaténation  : " + largeur+ " - "+longueur );
        System.out.println( "la surface  : " + (largeur * longueur) );
        System.out.println( "phrase  : " + c1 + c2 );
    }
}