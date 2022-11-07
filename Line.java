class Line {

    public static void lineSpeciale( int longueur, String extremit, String remplissage )
    {
        System.out.print( extremit );
        for( int j = 0 ; j <longueur-2 ; j = j + 1 ) 
            System.out.print( remplissage );
        System.out.println( extremit );
    }

    public static void lineOfx( int longueur  )
    {
        System.out.print( "+" );
        for( int j = 0 ; j <longueur-2 ; j = j + 1 ) 
            System.out.print( "-" );
        System.out.println( "O" );
    }

    public static void lineOfXx( int longueur )
    {
        lineSpeciale(  longueur, "+", "-");
    }

    public static void rectangle( int largeur, int hauteur)
    {
        lineOfx( largeur );
        for ( int i=0 ; i < hauteur ; i = i + 1)
            lineSpeciale( largeur, "|", " " );
        lineOfx( largeur );
    }
    
    public static void main(String[] args) {

        rectangle( 20, 5 );
        rectangle( 5, 5 );
        rectangle( 10, 3 );
    }
}
