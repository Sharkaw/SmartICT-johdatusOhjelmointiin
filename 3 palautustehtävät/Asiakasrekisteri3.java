/*
* Asiakasrekisteri osa 3
* (c) Suvi'20
*/
import java.util.Scanner;
import java.util.StringTokenizer;

public class Asiakasrekisteri3 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //Kysytään kaikkia tietoja
        System.out.println("Tervetuloa!\nSyota etunimesi;sukunimesi;ikasi;onko ajokorttia Y/N:");
        String kayttaja = lukija.nextLine();

        //luodaan jakaja
        StringTokenizer pilkottava = new StringTokenizer(kayttaja, ";");

        String etunimi = pilkottava.nextToken();
        String sukunimi = pilkottava.nextToken();
        String ika = pilkottava.nextToken();
        String ajokortti = pilkottava.nextToken();
        String onko = " ";

        if ((ajokortti.equals("E")) || (ajokortti.equals("e"))) { //vertaillaan merkkijonoja ja määritellään vastaus sen mukaan
            onko = " ei ole ajokorttia.";
        }
        else {
            onko = " on ajokortti.";
        }

        //tulostetaan ulos
        System.out.println("Syotetty tiedot asiakkaasta " + sukunimi + ", " + etunimi + ", joka on " + ika + " vuotta vanha ja jolla" + onko);
    

    }
}