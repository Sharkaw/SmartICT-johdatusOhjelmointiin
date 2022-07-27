/* Mökkiapuohjelma 2
 * (C) Suvi'20
 */

import java.util.Scanner;

public class Mokkiapuohjelma2 {
   public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
            
        //Kysytään käyttäjältä summa
        System.out.println("Anna euromaara:");
        String euromaara = lukija.nextLine();

        //Tutkitaan missä kohtaa on piste
        int piste = euromaara.indexOf(".");

        //erotellaan eurot ja sentit
        System.out.println("Maara on " + euromaara.substring(0, piste) + " euroa ja " + euromaara.substring(piste + 1) + " senttia.");
        

        
    }

}