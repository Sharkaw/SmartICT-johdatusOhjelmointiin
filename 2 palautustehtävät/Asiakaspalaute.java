/*Asiakaspalautejärjestelmä
 * (C) Suvi'20
 */

import java.util.Scanner;

public class Asiakaspalaute {
   public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
            
        //Kysytään käyttäjältä arvosana
        System.out.println("Anna arvosanasi (0-5) palveluista: ");
        int arvosana = lukija.nextInt();
        
        //tutkitaan mikä numero on annettu
        switch (arvosana) {
            case 0:
                System.out.println("Palaute oli huonoa.");
                break;
            case 1:
                System.out.println("Palaute oli kohtalaista.");
                break;
            case 2:
                System.out.println("Palaute oli tyydyttavaa.");
                break;
            case 3:
                System.out.println("Palaute oli hyvaa.");
                break;
            case 4:
                System.out.println("Palaute oli kiitettavaa.");
                break;
            case 5:
                System.out.println("Palaute oli erinomaista.");
                break;
            default:
                System.out.println("VIRHE! Anna numero!");
        }
        System.out.println("\nKiitos palautteestasi!");
    }

}