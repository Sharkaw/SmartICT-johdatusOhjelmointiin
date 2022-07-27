/** Mökkivarausjärjestelmä 2
 * (C) Suvi'20
 */
import java.util.Scanner;

public class mokkivarausjarjestelma2 {
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
        
        //Kysytään käyttäjältä etsittävä numero
        System.out.println("Anna haettava palvelu: ");
        String haettavaPalv = lukija.nextLine();

        //loopataan taulukko läpi ja tulostetaan kun löytyy
        for (i=0; i <palvelut.length;i++) {
            if (haettavaPalv.equals(palvelut[i])){
                System.out.println("Loytyy alkiosta " + i);
            }
            else {
                System.out.println("Ei loydy!");
            }
        }
    }  
}
