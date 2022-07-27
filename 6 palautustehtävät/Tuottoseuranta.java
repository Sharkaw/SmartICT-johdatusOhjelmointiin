/** Tuottoseuranta sovellus
 * (C) Suvi'20
 */

import java.util.Scanner;

public class Tuottoseuranta {
    public static void main(String [] args) {

        //luodaan matriisitaulukko ja skanneri
        double [][] tuotot = new double [5][7];
        Scanner lukija = new Scanner (System.in);

        //Kysytään käyttäjältä palveluiden tuotot
        for (int palveluIndex = 0; palveluIndex < 5; palveluIndex ++){
            for (int paivaIndex= 0; paivaIndex <7; paivaIndex++){
                System.out.println("Anna palvelun " + (palveluIndex + 1) + " tuotto paivana " + (paivaIndex + 1));

                tuotot [palveluIndex][paivaIndex] = lukija.nextDouble();
        
            }
        }

        //Aletaan laskemaan määriä ja tulostetaan, palvelun koko viikon tuotto yhteensä
        double tuottoSumma = 0;
        double yhteensa = 0;

        for (int palveluIndex = 0; palveluIndex < 5; palveluIndex ++){
            for (int paivaIndex= 0; paivaIndex <7; paivaIndex++){
                tuottoSumma = tuottoSumma + tuotot[palveluIndex][paivaIndex];
            }
            System.out.println("Palvelun " + (palveluIndex +1) + " tuotto yhteensa: " + tuottoSumma);
            
            yhteensa = yhteensa + tuottoSumma;
            tuottoSumma = 0;
        }
        
        //keskiarvotuotto  koko viikolta
        System.out.println("Keskiarvotuotto koko viikolta: " + (yhteensa / tuotot.length));

        System.out.println("");
        System.out.println("*************************");

        double yhteensaPaiva = 0;
        double tuottoSummaPaiva = 0;

        //päivittäiset keskiarvot per palvelu
        for (int paivaIndex = 0; paivaIndex < 7; paivaIndex ++){
            for (int palveluIndex= 0; palveluIndex <5; palveluIndex++){

                tuottoSummaPaiva = tuottoSummaPaiva + tuotot[palveluIndex][paivaIndex];
                yhteensaPaiva = yhteensaPaiva + tuottoSummaPaiva;
                //System.out.println("Tassa on " + yhteensaPaiva); TARKISTUS
                tuottoSummaPaiva = 0;
            }
            //System.out.println("Tassa on " + yhteensaPaiva); TARKISTUS
            System.out.println ("Paivan " + (paivaIndex + 1) + " keskiarvotuotto oli " + (yhteensaPaiva / 5));
            yhteensaPaiva = 0;
        }
    } 
}
