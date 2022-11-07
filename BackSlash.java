class BackSlash {


    public static void main( String[] args )
    {

        String chaine ="Bonjour\nil fait beau à Lille\n\taller à la plage\n\taller au ski\n\taller à la pêche\nvoila une belle journée.";
        System.out.println( chaine );

        System.out.println( "---------------------------" );

        chaine = "toto";
        chaine += " ";
        chaine += "va à la peche";
        chaine = chaine + " et au marché.";


        System.out.println( chaine );


    }
}