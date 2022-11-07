import box.BoxLib;

class LoopOne {
    public static void main(String[] args) {
        for( int i=0; i<10 ; i++ )
            System.out.println( i ); 
        System.out.println( BoxLib.linex( 5, "+" ) ); 
        for( int i=0; i<10 ; i++ )
            System.out.println( BoxLib.linex( 5, "|", " " ) ); 
        System.out.println( BoxLib.linex( 5, "+" ) ); 

    }

}