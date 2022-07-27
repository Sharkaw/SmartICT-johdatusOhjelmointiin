/** Mökkivarausjärjestelmä
 * (C) Suvi'20
 */
import java.util.Scanner;

public class mokkivarausjarjestelma {
    public static void main(String [] args) {
        //Scanneri
        Scanner lukija = new Scanner(System.in);

        //Taulukot ja muuttujat
        String [] palvelut = new String[5];
        int i = 0;

        //while loopilla kysytään palveluiden nimet ja sijoitetaan taulukkoon
        while (i<5) {
            System.out.println("Syota palvelun nimi: ");
            palvelut [i] = lukija.nextLine();
            i = i + 1;
        }
        
        //For-loopilla tulostetaan alusta loppuun
        for(i=0; i<palvelut.length; i++) {
            System.out.println("Palvelu " + i +". " + palvelut[i]);
        }

        System.out.println("\n\t*******\n");
        
        // ja lopusta alkuun
        for(i=palvelut.length-1; i>=0; i--) {
            System.out.println("Palvelu " + i +". " + palvelut[i]);
        }
    }
    
}
