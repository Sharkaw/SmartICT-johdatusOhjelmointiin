/**
 * Vastaus-funktio
 * (C) Suvi'20
 */

import java.util.Scanner;

public class Vastaus {
    public static void main(String[] args) {
        //kutsutaan metodia
        myVastaus();
        
    }
    public static String myVastaus() {
        //Scanneri
        Scanner input = new Scanner(System.in);
        //Kysytään
        System.out.print("Kylla vai ei (K/E)?" );
        String kirjain = input.nextLine();

        //palautetaan annettu vastaus, joskaan ei vielä näy
        return kirjain;
    }
    
    
}
