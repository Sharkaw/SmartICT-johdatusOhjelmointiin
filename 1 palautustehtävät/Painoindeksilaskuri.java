/* Painoindeksilaskuri
*  (C) Suvi'20
*/
import java.util.Scanner;

public class Painoindeksilaskuri {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //Kysytään käyttäjän pituus ja paino
        System.out.println("\n\tTervetuloa hyvinvointi- ja terveyskartoitukseen");
        System.out.println("\nAnna pituutesi (m):");
        double pituus = lukija.nextDouble();

        System.out.println("\nAnna painosi (kg):");
        double paino = lukija.nextDouble();

        //Lasketaan indeksi ja pyöristetään
        double summa = (1.3 * paino) / (Math.pow(pituus, 2.5)); //https://www.laskurini.fi/terveys/painoindeksilaskuri/painoindeksin-laskeminen
        double pyoristys = Math.round (1000 * summa) / 1000;

        //tutkitaan mihin kategoriaan painoindeksi kuuluu ja tulostetaan vastaus
        if (pyoristys < 18.4){
            System.out.println("\nPainoindeksisi on " + pyoristys + ": Alhainen paino");
        }
        else if ((pyoristys >= 18.4) && (pyoristys < 25.0)) {
            System.out.println("\nPainoindeksisi on " + pyoristys + ": Normaali paino");
        }
        else if ((pyoristys >= 25.0) && (pyoristys < 30.0)) {
            System.out.println("\nPainoindeksisi on " + pyoristys + ": Lieva ylipaino");
        }
        else {
            System.out.println("\nPainoindeksisi on " + pyoristys + ": Merkittävä ylipaino");
        }

    }
        //Miten switch-case-tapaa olisi voinut käyttää? tai olisko voinut?
}