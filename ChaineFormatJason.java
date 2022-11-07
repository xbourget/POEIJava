public class ChaineFormatJason {
    public static String formatChaine(String objet, int quantite, double pu, double pt) {
        //return String.format("|%s |%o |%,.2f|%,.2f\n", objet, quantite, pu, pt );
         
        return String.format("|%s", objet)
                + String.format("|%o", quantite)
                + String.format("|%,.2f", pu)
                + String.format("|%,.2f", pt)
                + "\n";
    }

    public static void main(String[] args) {
        String resultat = formatChaine("tomate", 2, 3.99, 7.98);
        System.out.print(resultat);
        System.out.print(formatChaine("tomate", 2, 3.99, 7.98));
    }
}