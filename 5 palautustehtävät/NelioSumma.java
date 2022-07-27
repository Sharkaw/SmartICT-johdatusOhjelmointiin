/**
 * Neliösumma-metodi
 * (c) Suvi'20
 */
import java.util.Scanner;

public class NelioSumma {
    public static void main(String[] args) {
        //luodaan skanneri ja pyydetään syöttämään luvut
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna ensimmainen luku: ");
        double ekaLuku = lukija.nextDouble();

        System.out.println("Anna toinen luku: ");
        double tokaLuku = lukija.nextDouble();

        //Kutsutaan metodia
        laskeNelioSumma(ekaLuku, tokaLuku);
    }
    //metodi, jolla lasketaan
    public static void laskeNelioSumma(double ekaLuku, double tokaLuku) {
        double summa = (Math.sqrt(ekaLuku) + Math.sqrt(tokaLuku));

        System.out.print("Lukujen nelioiden summa on " + summa);
        
    }
    
}
