class ChaineOne {

    public static void CenterString( String fond, String titre  )
    {
        Integer larFond = fond.length();
        Integer larTitre = titre.length();
        
        Integer LarPading = (larFond-larTitre)/2;

        String paddingLeft = fond.substring(0, LarPading );
        String paddingRight = fond.substring( larFond-LarPading, larFond );

        System.out.println( paddingLeft + titre + paddingRight );
    }



    public static void main( String[] args )
    {
        CenterString( "00000000000000000000000000000000000000000000000000" , " bonjour ");
        CenterString( "          " , "*");
        CenterString( "          " , "***");
        CenterString( "          " , "*****");
        CenterString( "          " , "*******");
        CenterString( "          " , "*********");
    }
}


// ma boite
// +---------------------------------+

// +----------  ma boite ------------+
// +------------------------+ma boite 
// +------------ 


// Toto va à la plage
