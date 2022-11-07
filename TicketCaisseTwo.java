import java.util.*;
import java.util.ArrayList.*;

class TicketCaisseTwo {
    // Xavier

    // creation des list qui vont contenir les données
    static ArrayList<String> noms       = new ArrayList(); // instancier l'objet ArrayList
    static ArrayList<Double> prixs      = new ArrayList();
    static ArrayList<Double> quantites  = new ArrayList(); 


    public static void addArticle(String nom, Double prix, Double qte) {
        noms.add(nom);
        prixs.add(prix);
        quantites.add(qte);
    }

    public static Double affArticle(Integer i) {

        Double prixTotalArticle = prixs.get(i) * quantites.get(i);

        System.out.println( String.format("%2d -> %20s    %6.2f  %5.2f   %8.2f", i + 1, noms.get(i), prixs.get(i), quantites.get(i), prixTotalArticle));
        return prixTotalArticle;
    }

    public static Double calculTotalTicket() {

        Double total = 0.0;
        for (int i = 0; i < noms.size(); i++)
            total += prixs.get(i) * quantites.get(i);
        return total;
    }

    public static void afficheTicket() {

        for (int i = 0; i < noms.size(); i++)
        {
            System.out.println(String.format("%2d %15s %5.2f %5.2f %7.2f ", 
                                                i+1,
                                                noms.get( i ),
                                                prixs.get( i ),
                                                quantites.get( i ),
                                                prixs.get( i ) * quantites.get( i )
                                                ));
        }
        
    }

    public static void supprimeArticle( String nom ) {

        int positionArticle = noms.indexOf( nom );

        noms.remove(positionArticle);
        prixs.remove(positionArticle);
        quantites.remove(positionArticle);
    }

    public static void main(String[] args) {

        addArticle("romarin", 7.56, 1.0);
        addArticle("rutabaga", 1.5, 5.0);
        addArticle("choux de Brx", 4.50, 1.0);
        addArticle("réglisse", 8.75, 0.5);
        addArticle("bettes", 2.4, 1.0);

        afficheTicket();

        supprimeArticle( "réglisse" );


        System.out.println("-------------------------------");
        afficheTicket();
        //modifieQuantiteArticle( "romarin", 3.0 );

        Double total = calculTotalTicket();
        System.out.println(String.format("montant total  %8.2f", total));
    }
}