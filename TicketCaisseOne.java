import java.util.*;

class TicketCaisseOne {
    // Xavier

    static String noms[]        = { "patate", "tomate", "oignons", "radis", "salade",     "rose",   "jasmin",  "nénuphar", "oeillet", "tulipe", "rhododendron"  }; 
    static Double prixs[]       = {   1.5,      4.0,          1.6,      1.5,    1.0,       7.0,       14.0,        78.55,     5.5,        4.0,          19.99      }; 
    static Double quantites[]   = {   3.0,      1.0,          1.0,      0.0,    1.0,       1.0,       0.0,          0.5,      0.0,        1.0,          21.0      }; 


    public static void afficheArticle( int numArticle )
    {
        System.out.println( 
            String.format( "%2d -> %20s    %6.2f  %5.2f   %8.2f", 
                            numArticle+1, 
                            noms[ numArticle ], 
                            prixs[numArticle], 
                            quantites[numArticle], 
                            prixs[numArticle] * quantites[numArticle] )   );
    }

    public static Double calculMoyenneAchat()
    {
        return calculTotalTicket() / noms.length;
    }

    public static Double calculMoyenneArticle()
    {
        Double total = 0.0;

        int nbrArticle = noms.length;
        for( int numArticle = 0; numArticle < nbrArticle ; numArticle++ )
        {
            total += prixs[ numArticle ];
        }
        return total / nbrArticle;
    }

    public static Double calculTotalTicket()
    {
        Double totalTicket = 0.0;

        int nbrArticle = noms.length;
        for( int numArticle = 0; numArticle < nbrArticle ; numArticle++ )
        {
            Double totalArticle = prixs[ numArticle ] * quantites[ numArticle ];
            totalTicket += totalArticle;
        }
        return totalTicket;
    }

    public static void afficheTicket()
    {
        int nbrArticle = noms.length;

        for( int numArticle = 0; numArticle < nbrArticle ; numArticle++ )
            afficheArticle(numArticle);
    }

    public static void main( String[] args )
    {
            afficheTicket();
            System.out.println( String.format( "total ticket : %5.2f", calculTotalTicket() ));
            Double moyenneAchat = calculMoyenneAchat();
            System.out.println( String.format( "moye achat   : %5.2f", moyenneAchat ));
            Double moyenneArticle = calculMoyenneArticle();
            System.out.println( String.format( "moye article   : %5.2f", moyenneArticle ));
    }
}
                     