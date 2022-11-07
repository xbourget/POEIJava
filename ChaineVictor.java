import java.util.*;

public class ChaineVictor{
// Programme encapsulée dans une classe
// Une classe commence toujours par une majuscule

    public static void main(String[] args){ // Un programme commence forcément par un main, c'est le point d'entrée dans le programme
         
        // Types de variables
        Integer entier      =   5                   ;
        Float floater       =   10.05f              ;
        Double doublee       =   10.05               ;
        String chaineCarac  =   "Titi, toto, tata"  ;

        // Afficher des données dans un terminal
        System.out.println(chaineCarac+" avec "+entier+" puis "+floater);

        // Les conditions
        // | dans une conditions est le "or" et & est les "and", si plusieurs conditions ajouter
        // "else if..."
        if(entier>5 | entier<5){
            System.out.println("L'entier n'est ni supérieur, ni inférieur strictement à 5");
        }else{
            System.out.println("L'entier est donc égal à 5");
        }

        // Les boucles
        // Pour les boucles if la convention est if( start, valeur max; pas d'ajouts)
        for(int i=0 ; i<10 ; i++){
            System.out.println("Indice "+i);
        }

        // Les fonctions externes au main
        // On les définis en dehors de la fonction main d'une certaine façon
        fonctionExterne();

        // Les listes
        // on doit pas oublier d'importer les biblio nécessaires
        List<String> color = new ArrayList<String>();
        color.add("Blue");
        color.add("Red");
        color.add("Green");
        System.out.println(color.toString());

        // Split des chaines de caractères
        String str = "J'aime le Java et la programation";
        List<String> myList = new ArrayList<String>(Arrays.asList(str.split(" ")));
        System.out.println(myList);

        // Appeler des fonctions issues d'autres classes
        int larg = 5;
        int longu= 6;
        // System.out.println("Surface du rectangle de "+Surface.surfaceRect(larg, longu)+" cm2"); // on appele en general une fonction via nomDuFichier.nomDeLaFonctionPublic

        // Demander des choses à l'utilisateur
        Scanner scan= new Scanner(System.in);  
        System.out.print("Entre ton nom:");  
        String userInput= scan.nextLine();  
        System.out.println("Bonjour "+userInput+", comment vas-tu ?");
        scan.close();

        // Intéragir avec des éléments de liste
        List<Object> pdt = new ArrayList<Object>();
        List<String> pdtStr = new ArrayList<>();
        int pdtInt=5;
        pdtStr.add("Pomme");
        pdtStr.add("de");
        pdtStr.add("terre");
        pdt.add(pdtStr);
        pdt.add(pdtInt);
        System.out.println(pdt);
        System.out.println(pdt.get(0));
        
        // Division des strings
        String strVar = "J'aime les pommes de terre";
        String newStrVar = strVar.substring(0,10);
        System.out.println(newStrVar);
        
    }


    // Fonction externe
    // on met private car la fonction ne sera pas accessibles dans une autre classe
    private static void fonctionExterne() {
        System.out.println("Fonction externe au main");
    }
}