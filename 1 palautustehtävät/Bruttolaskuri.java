/* Bruttolaskuri
* (C) Suvi'20
*/
import java.util.Scanner;

public class Bruttolaskuri {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //Pyydetään kustannuksen nettohintaa ja alv-prosettia
        System.out.println("\nAnna nettohinta:");
        double nettoHinta = lukija.nextDouble();

        System.out.println("\nAnna alv-prosetti:");
        double alv = lukija.nextDouble();

        //Lasketaan bruttohinta ja pyöristetään
        double bruttoHinta = Math.round((((alv / 100) + 1) * nettoHinta) * 100.0) / 100.0;

        //Tulostetaan näkyviin
        System.out.println("\nBruttohinta on " + bruttoHinta + " euroa.");

    }
}
