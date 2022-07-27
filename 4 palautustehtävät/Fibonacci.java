/**
 * Fibonacci kerroin liikevaihdossa
 * 1,1,2,3,5,8,13,21,34,55,
 * (C) Suvi'20
 */
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //Kysytään käyttäjältä toimintavuoden numeroa
        System.out.print("Syota toimitavuoden numero: ");
        int vuosi = lukija.nextInt();
        int i;
        int [] fibonacci = {1, 1, 2, 3, 5, 8, 13, 21};

        //Vielä kesken ja hakee ymmärrystä
        for (i = 0; i<= vuosi;i++){
            fibonacci[i];
        }

        
    }
    
}
