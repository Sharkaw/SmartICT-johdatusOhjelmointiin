/**
 * Metodiaharjoituksia
 * (C) Suvi'20
 */
import java.util.Scanner;
public class Metodiharjoituksia {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna nimi: ");
        String nimi = lukija.nextLine();

        System.out.print("Anna arvosana: ");
        int luku = lukija.nextInt();

        tulostaPylvas(nimi, luku);
        tulostaPylvas("Maija", 2);
        tulostaPylvas("Pekka", 0);
        tulostaPylvas("Liisa", 5);
        
        // ----------------------------

        //Suunnittele nelilaskuri, joka laskee peruslaskutoimitukset metodeissa.
        //Pyydä käyttäjältä käytettävät kokonaisluvut. Tulosta tulokset.

        System.out.print("Anna luku1:");
        int luku1 = lukija.nextInt();
        System.out.print("Anna luku2:");
        int luku2 = lukija.nextInt();

        System.out.println("Summa on " + summa(luku1, luku2));
        System.out.println("Erotus on " + erotus(luku1, luku2));
        System.out.println("Tulo on " + tulo(luku1, luku2));
        if (luku2 != 0)
            System.out.println("Osamaara on " + osamaara(luku1, luku2));
        else
            System.out.println("Virhe: jako nollalla!");
    }
    public static void tulostaPylvas(String nimi, int pituus) {
        System.out.print(nimi + "\t");
        if (pituus == 0)
            System.out.print("hylatty");
        
        else 
            for (int i =0; i<pituus; i++)
                System.out.print("*");
        System.out.println();
        
    }

    public static int summa(int a, int b) {
        return a+b;
    }
    public static int erotus(int a, int b) {
        return a-b;
    }
    public static int tulo(int a, int b) {
        return a*b;
    }
    public static double osamaara(int a, int b) {
        return 1.0*a/b;
    }
    
}
