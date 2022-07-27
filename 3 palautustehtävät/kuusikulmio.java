/*Kuusikulmiolaskuri
(C) Suvi'20 */

import java.util.Scanner;

public class kuusikulmio {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna kuusikulmion sivun pituus:");
        double sivu = lukija.nextDouble();
        //lasketaan ja pyöristetään
        double laske = Math.round((6 * Math.pow(sivu,2))/(4 * Math.tan(Math.PI/6)) * 100.0)/100.0;

        System.out.println("Kuusikulmion ala on " + laske);
    }
}
