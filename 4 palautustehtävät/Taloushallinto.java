/**
 * Taloushallinnon kustannusten keskiarvo
 * (C) Suvi'20
 */
import java.util.Scanner;

public class Taloushallinto {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //Kysytään kustannusten lukumäärää ja määritellään muuttujat
        System.out.println("Anna kustannus lukumaara: ");
        int lukumaara = lukija.nextInt();
        int i;
        double summa = 0;

        //Looppi, jolla kysytään oikea määrä kustannuksia ja lasketaan niitä yhteen
        for(i=0; i < lukumaara; i++){
            System.out.println("Anna kustannus: ");
            double kustannus = lukija.nextDouble();

            summa = summa + kustannus;
        }
        //lasketaan keskiarvo ja ilmoitetaan tulos
        double keskiarvo = summa / lukumaara;

        System.out.print("Keskiarvo on " + keskiarvo);
    }
}
