package box;

public class BoxLib {

    public static String linex ( int len, String term )
    {   
        return linex ( len, term, "-" );    
    }

    public static String linex ( int len, String term, String fill )
    {   
        String r = term;
        for( int i = 0 ; i < len ; i++ ) {
            r += fill;
        }
        r += term;
        return r;    
    }
}