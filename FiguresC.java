
class FiguresC {

    public static void main (String[] args) {
        int hauteur = 5;
        dessineSablier(hauteur);
     }

     public static void dessineSablier (int hauteur) {
        // haut
        for( int i = 0 ; i < hauteur ; i ++ ) {
            for( int j = 0 ; j < i ; j++ ){
                System.out.print( " " );   
            }
            for( int j = hauteur-i ; j > 0 ; j-- ){
                System.out.print( "*" );    
            }
            for( int j = hauteur-i ; j > 1 ; j-- ){
                System.out.print( "*" );    
            }
            System.out.println( "");    
        }

        // bas
        for( int i = 2 ; i <= hauteur ; i++ ) {
            for( int j = hauteur-i ; j > 0 ; j-- ){
                System.out.print( " " );    
            }
            for( int j = 0 ; j < i ; j++ ){
                System.out.print( "*" );   
            }
            for( int j = 1 ; j < i ; j++ ){
                System.out.print( "*" );   
            }
            System.out.println( "");   
        }
     }

      }
