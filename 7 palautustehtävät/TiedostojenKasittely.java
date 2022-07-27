/** 
 * Tiedostojen käsittely
 * (C) Suvi'20
 * 
 */

import java.util.Scanner;
import java.io.*;

public class TiedostojenKasittely {
    final static String TIEDOSTO = "hakemisto.txt";
    public static void main(String [] args) {
        Scanner lukija = new Scanner(System.in);
        char vastaus;

        do {
            tulostaOtsikko();
            tulostaMenu();
            System.out.print("\tValitse (0-2): ");
            vastaus = lukija.nextLine().charAt(0);
            
            switch(vastaus) {
                case '0': break;
                case '1': tulostaTiedosto(); break;
                case '2': lisaaAsiakas(); break;
                case '3': etsiAsiakas(); break;
                default: System.out.println("\tVirheellinen valinta!");
            }
        }
        while (vastaus !='0');
        System.out.println("\nSuljetaan ohjelma!");  
  
    }

    public static void tulostaOtsikko() {
        System.out.println("\n\t ASIAKASTIETO HAKEMISTO \n\t================\n");
    }

    public static void tulostaMenu() {
     System.out.println("\nMenu\n\t1. Lue hakemisto\n\t2. Lisaa asiakas\n\t3. Etsi asiakas\n\t0. Poistu");
    }

    public static void tulostaTiedosto() {
        try { //avataan tiedosto, käsitellään while-loopilla ja suljetaan
            BufferedReader tiedostolukija = new BufferedReader(new FileReader(TIEDOSTO));
            
            String luetturivi;
            while ((luetturivi = tiedostolukija.readLine()) != null){
                System.out.println(luetturivi);
            }
            tiedostolukija.close();
                
        } catch (FileNotFoundException e) {
            System.out.println("Virhe: ei tiedostoa " + TIEDOSTO);
            System.exit(1);
        }  catch (IOException e) {
            System.out.println("Virhe: syote- ja tulostevirtojen kasittely epaonnistui " + TIEDOSTO);
            System.exit(1);
        }
    }
    
    public static void lisaaAsiakas() {
        //luodaan skanneri
        Scanner lukija = new Scanner(System.in);

        String nimi;
        String eMail;
        String puhNum;
        String dataNum;
  
        //Kysytään käyttäjältä tietoja
        System.out.println("Anna datanumero:");
        dataNum = lukija.nextLine();

        System.out.println("Anna nimi:");
        nimi = lukija.nextLine();

        System.out.println("Anna E-mail:");
        eMail = lukija.nextLine();

        System.out.println("Anna puhelinnumero:");
        puhNum = lukija.nextLine();

        try{
            // luodaan tarvittavat oliot kirjoittamiseen
            BufferedWriter kirjoittaja = new BufferedWriter(new FileWriter(TIEDOSTO, true));

            //Kirjoitetaan vastaukset tiedostoon
            kirjoittaja.write("Datatiedot asiakkaalle numero " + dataNum);
            kirjoittaja.newLine();

            kirjoittaja.write("Nimi: " + nimi);
            kirjoittaja.newLine();

            kirjoittaja.write("E-mail: " + eMail);
            kirjoittaja.newLine();

            kirjoittaja.write("Puhelinnumero: " + puhNum);
            kirjoittaja.newLine();

            //Suljetaan tiedosto
            kirjoittaja.close();
        }
        catch (IOException e){
            System.out.println("Syote- ja tulostevirtojen kasittely epaonnistui. Lopetan.");
            System.exit(1);
        }
        catch (Exception e){
            System.out.println("Jotain meni pieleen. Lopetan.");
            System.exit(1);
        }
    }

    // Tätä en nyt saanut toimimaan oikein
    
    public static void etsiAsiakas() {
        Scanner lukija = new Scanner(System.in);
        Scanner etsija = new Scanner(TIEDOSTO);

        System.out.println("Syota asiakasnumero: ");
        String asNum = lukija.nextLine();

        String luetturivi = etsija.nextLine();
        while (etsija.hasNextLine()){
                
            if(luetturivi.contains(asNum)){
                System.out.print("Loytyi.");
                for(int i = 1; i<=3;i++) {
                    luetturivi = etsija.nextLine();
                    System.out.println(luetturivi);
                }
            } 
            
            else {
                for(int i = 1; i<=3;i++) {
                    luetturivi = etsija.nextLine();
                    System.out.print("Ei loydy.");
                        
                }
            }
        }
        etsija.close();
    }
    
}
