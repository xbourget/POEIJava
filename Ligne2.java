// Bourget
public class Ligne2 {

    public static void line( int l )
    {
        line( l, "+", "-" );
    }

    public static void line( int l, String remplissage )
    {
        line( l, "|", remplissage );
    }

    public static void line( int l, String extremite, String remplissage )
    {
        l = l - 2;
        System.out.print( extremite );    
        for ( int i = 0; i<l ; i = i + 1 )
            System.out.print( remplissage );    
        System.out.println( extremite );    
    }

    public static void rectangle( int l, int L )
    {
        line( l );
        for ( int i = 0; i<L ; i = i + 1 )    
            line( l, " " );
        line( l );
    }

  public static void main( String[] args )
    {
        rectangle(  5, 9 );
        rectangle( 56, 3 );

        line( 44 );
        line( 44, "O" );
        
    }    
} 