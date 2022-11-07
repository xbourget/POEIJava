// Bourget
public class SurfaceP {

    public static double surface( int lar, int longueur )
    {
        return lar*longueur;
    }

    public static double surface( int cote )
    {
        return surface( cote, cote );
    }

    public static double surface( double rayon )
    {
        return rayon * rayon * 3.14;
    }

   public static void main( String[] args )
    {
        //System.out.println( args[0]  );
        System.out.println( surface( 5, 8 ) );
        System.out.println( surface( 7 ) );
        System.out.println( surface( 7.5 ) );
    }    
}