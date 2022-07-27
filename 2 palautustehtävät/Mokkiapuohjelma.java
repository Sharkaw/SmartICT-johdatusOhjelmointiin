/*Mökkiapuohjelma
 * (C) Suvi'20
 */

import java.util.Scanner;

public class Mokkiapuohjelma {
   public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
            
        //Kysytään käyttäjältä kuukausi
        System.out.println("Syota kuukausi numeroina (1-12): ");
        int arvosana = lukija.nextInt();
        
        //tutkitaan mikä numero on annettu
        switch (arvosana) {
            case 1:
                System.out.println("Tammikuu");
                break;
            case 2:
                System.out.println("Helmikuu");
                break;
            case 3:
                System.out.println("Maaliskuu");
                break;
            case 4:
                System.out.println("Huhtikuu");
                break;
            case 5:
                System.out.println("Toukokuu");
                break;
            case 6:
                System.out.println("Kesakuu");
                break;
            case 7:
                System.out.println("Heinakuu");
                break;
            case 8:
                System.out.println("Elokuu");
                break;
            case 9:
                System.out.println("Syyskuu");
                break;
            case 10:
                System.out.println("Lokakuu");
                break;
            case 11:
                System.out.println("Marraskuu");
                break;
            case 12:
                System.out.println("Joulukuu");
                break;
            default:
                System.out.println("VIRHE! Anna numero 1-12!"); //jos numero on jotain muuta kuin 1-12
        }
        
    }

}