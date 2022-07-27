/*Mökkiapuohjelma 3
    - Positiivisen kokonaisluvun kertoma (n!)
 * (C) Suvi'20
 */

import java.util.Scanner;
public class Mokkiapuohjelma3 {
    public static void main(String[] args) {
        //määritellään muuttujat
        int i = 1;
        int kertoma = 1;

        //Luodaan scanner
        Scanner lukija = new Scanner(System.in);

        //Kysytään käyttäjältä lukua
        System.out.println("Anna (positiivinen) luku: ");
        int luku = lukija.nextInt();

        //looppi
        for (i = 1; i <= luku; i++) {
            kertoma = kertoma * i;
        }
        System.out.println("Luvun " + luku + " kertoma on " + kertoma); 
    }
}