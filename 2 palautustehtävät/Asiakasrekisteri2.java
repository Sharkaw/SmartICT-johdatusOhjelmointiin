/*
* Asiakasrekisteri osa 2
* (c) Suvi'20
*/
import java.util.Scanner;

public class Asiakasrekisteri2 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //Kysytään etunimeä ja syötetään muuttujaan
        System.out.println("Tervetuloa!\nSyota etunimesi:");
        String etunimi = lukija.nextLine();

        //Kysytään sukunimi
        System.out.println("\nSyota sukunimesi:");
        String sukunimi = lukija.nextLine();

        //Kysytään ikä
        System.out.println("\nSyota ikasi numeroina:");
        String ika = lukija.nextLine();

        //Kysytään ajokortista
        System.out.println("Onko sinulla ajokorttia? (K) Kylla tai (E) Ei:");
        String ajokortti = lukija.nextLine(); //TÄSSÄ JOKU VIRHE?

        //tutkitaan vastaus ja tulostetaan muuttujat
        if ((ajokortti.equals("E")) || (ajokortti.equals("e"))) { //vertaillaan merkkijonoja
            System.out.println("\nSyotetty tiedot asiakkaasta " + etunimi + " " + sukunimi + ", joka on " + ika + " vuotta vanha ja jolla ei ole ajokorttia.");
        }
        else {
            System.out.println("\nSyotetty tiedot asiakkaasta " + etunimi + " " + sukunimi + ", joka on " + ika + " vuotta vanha ja jolla on ajokortti.");
        }

        //Toinen vaihtoehto
        
        /*switch (ajokortti) {
            case 'E':
            case 'e':
                System.out.println("\nSyotetty tiedot asiakkaasta " + etunimi + " " + sukunimi + ", joka on " + ika + " vuotta vanha ja jolla ei ole ajokorttia.");
                break;
            case 'Y':
            case 'y':
                System.out.println("\nSyotetty tiedot asiakkaasta " + etunimi + " " + sukunimi + ", joka on " + ika + " vuotta vanha ja jolla on ajokortti.");
                break;
        }*/

    

    }
}