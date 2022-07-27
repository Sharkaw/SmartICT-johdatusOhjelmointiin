/*
* Asiakasrekisteri
* (c) Suvi'20
*/
import java.util.Scanner;

public class Asiakasrekisteri {
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

        //Tulostetaan muuttujat
        System.out.println("\nSyotetty tiedot asiakkaasta " + etunimi + " " + sukunimi + ", joka on " + ika + " vuotta vanha.");

    }
}