class ChaineFormat {
// Xavier


    public static void main( String[] args )
    {

        String article = "patateajkehfjkzejkzebgjkzegbjkzgj";
        Integer qte = 2;
        double PU = 1.56;
        
        String  monFormat = " %-40s   | %-4d | %4.2f  | %06.2f |";
        
        
        String resultat = String.format( "vous avez acheté des %s %s à %e au magasin  ", "chaussures", "bleues", 45.236589  );

        System.out.println(resultat);

        article = "patatoen";
        qte = 2;
        PU = 1.56;
        /*
        monFormat = "| %-40s   | %-4d | %4.2f  | %06.2f |";
        resultat = String.format( monFormat, article, qte, PU, qte*PU );
        System.out.println(resultat);

        article = "sirop de fraise";
        qte = 2;
        PU = 1.56;
        
        monFormat = "| %-40s   | %-4d | %4.2f  | %06.2f |";
        resultat = String.format( monFormat, article, qte, PU, qte*PU );
        System.out.println(resultat);
        */
    }
}


// | libel      | qté   | PU         |  PT
// | tomate     | 2     | 3.99       |  7.98


// |    tomate  |    2  |     3.99   |  7.98
// |    tomate  |    2.-|       3.99 |  7.98
