/**
 * Palvelun käyttöseurantasovellus
 * (C) Suvi'20
 */
import java.util.Scanner;

public class Palveluseuranta {
    public static void main(String [] args) {
        
        //luodaan matriisitaulukko ja skanneri
        int [][] kayttoMaarat = new int [5][7];
        Scanner lukija = new Scanner (System.in);

        //Kysytään käyttäjältä palveluiden käyttömäärät
        for (int palveluIndex = 0; palveluIndex < 5; palveluIndex ++){
            for (int paivaIndex= 0; paivaIndex <7; paivaIndex++){
                System.out.println("Anna palvelun " + (palveluIndex + 1) + " kayttomaara paivana " + (paivaIndex + 1));

                kayttoMaarat [palveluIndex][paivaIndex] = lukija.nextInt();
                
                //Itselle huomio:
                //String luettu = "4":
                //int luettuint = Integer.parseInt(luettu); //muunnetaan stringistä intiksi
            }
        }

        //Aletaan laskemaan määriä ja tulostetaan, palvelun koko viikon käyttö yhteensä
        int kayttoSumma = 0;
        for (int palveluIndex = 0; palveluIndex < 5; palveluIndex ++){
            for (int paivaIndex= 0; paivaIndex <7; paivaIndex++){
                kayttoSumma = kayttoSumma + kayttoMaarat[palveluIndex][paivaIndex];
            }
            System.out.println("Palvelun " + (palveluIndex +1) + " kayttomaara yhteensa: " + kayttoSumma);
            kayttoSumma = 0;
        }

        System.out.println("");
        System.out.println("*************************");

        //yksittäisen palvelun päivittäiset käytöt
        for (int paivaIndex = 0; paivaIndex < 7; paivaIndex ++){
            for (int palveluIndex= 0; palveluIndex <5; palveluIndex++){

                System.out.printf("Palvelun %d paivana %d kayttomaara oli %d\n", palveluIndex + 1, paivaIndex + 1, kayttoMaarat [palveluIndex] [paivaIndex]);
            }
            
        }
    }
}
