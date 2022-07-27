/**
 * Tulostus-metodi
 * (C) Suvi'20
 */
import java.util.Scanner;

public class Tulosta {
    public static void main(String[] args) {
        //Scanneri ja kysytään käyttäjältä parametreja
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syota tulostettava: ");
        String tulostettava = lukija.nextLine();

        System.out.println("Syota montako kertaa: ");
        int luku = lukija.nextInt();

        //Kutsutaan metodia
        myTulosta(tulostettava, luku); 
    }
     //Metodi, tulostetaan annettu teksti haluttuun kertaan
     public static void myTulosta(String tulostettava, int luku) {
        for(int i = 1; i<= luku; i++){
            System.out.println(tulostettava);
        }  
    }
    
}
