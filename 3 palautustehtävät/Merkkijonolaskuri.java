/*  Merkkijonolaskuri
 *  (C) Suvi'20
 */
import java.util.Scanner;

public class Merkkijonolaskuri {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
            
        //Kysytään käyttäjältä numeroita
        System.out.println("Syota numeroita:");
        String numerot = lukija.nextLine();

        int summa = 0;
        //loopataan merkkijono läpi ja lasketaan yhteen
        for(int i = 0; i < (numerot.length()-1); i++){
            summa += (numerot.charAt(i)-'0');

        }

        System.out.println("Summa on " + summa);
    }
    
}
