public class Fonctions {


    public static int somme( int p1, int p2   )
    {
        return p1 + p2;
    }

    public static String surfaceRectangle( int largeur, int longueur )
    {
        return "surface rectangle("+longueur+","+largeur+" ) = " + (largeur * longueur) + " m2";
    }

    public static void surfaceRectangleV( int largeur, int longueur )
    {
        System.out.println( "surface rectangle("+longueur+","+largeur+" ) = " + (largeur * longueur) + " m2");
    }

    public static String disBonjour( String prenom )
    {
        return "Bonjour " + prenom + "! comment vas-tu ?";
    }

    public static String disBonjour(  )
    {
        return "Bonjour !";
    }

    public static String disBonjour( int age )
    {
        return "Bonjour ! tu as " + age + " ans.";
    }




    public static void main( String[] args )
    {
        //System.out.println( args[0]  );

        int resultat = somme( 5, 6 );
        System.out.println( resultat );
        System.out.println( surfaceRectangle( 5,8 ) );
        System.out.println( surfaceRectangle( 7,15 ) );
        surfaceRectangleV( 45, 78);

        System.out.println( disBonjour( "toto") );
        System.out.println( disBonjour() );
        System.out.println( disBonjour( 18 ) );


    }    
}
