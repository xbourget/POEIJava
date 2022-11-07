
class LoopAlgoTriangle {

  
    public static void dessineEtoile( int hauteur )
    {
        for( int numLigne = 0 ; numLigne <= hauteur ; numLigne++ )
        {
            for( int numEtoile = 0 ; numEtoile < numLigne ; numEtoile++ )
                System.out.print( "*" );
            System.out.println( "");
        }
    }

    public static double compteLesEtoiles( int hauteur )
    {
        double count = 0;

        for( int numLigne = 0 ; numLigne <= hauteur ; numLigne++ )
            for( int numEtoile = 0 ; numEtoile < numLigne ; numEtoile++ )
                count++;
        return count;
    }

    public static double compteLesEtoiles2( double hauteur )
    {
        return hauteur * (hauteur+1) / 2;
    }

    
    public static void main(String[] args) 
    {

        //dessineEtoile( 6 );

        int nbrLigne = 100000;
        System.out.println(  compteLesEtoiles( nbrLigne ) );
        System.out.println(  compteLesEtoiles2( nbrLigne  )  );

        /* 
         
            *
            **
            ***
            ****
            *****
        */
    }
}