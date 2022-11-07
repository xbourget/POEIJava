
class ForOne {
    public static void main(String[] args) {

     


        for(   int i = 5 ;   // initialisation
                i >  0 ;     // condition
                i-- )        // incrementation des variable
            System.out.println( i ); 
    
    
            int a = 0;
            for( ; ; )
            {   
                if ( a == 5 )
                    break;
                System.out.println( a );
                a++;
            }
    
            System.out.println("sortie");

            int b = 0;
            while( b < 5 )
            {   
                System.out.println( b );
                b++;
            }
    
            System.out.println("sortie");
    
    
        }
}