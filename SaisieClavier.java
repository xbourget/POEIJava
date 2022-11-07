import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Scanner;



class SaisieClavier { 
    public static void main (String[] arg)  {

	java.util.Scanner entree =   new java.util.Scanner(System.in);
	
	System.out.println("Donnez votre prénom et votre nom");
	String prenom = entree.next();
	String nom = entree.next();
	System.out.println("Donnez votre âge");
	int age = entree.nextInt();
	entree.nextLine();
	System.out.println("Ecrire votre phrase");
	String phrase = entree.nextLine();
	System.out.println(prenom + " " + nom + ", " +  age + " ans, dit : " + phrase);
    } 
}
