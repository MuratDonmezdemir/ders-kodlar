package serbestCalisma;

import java.util.Scanner;

public class day03_diktorgenAlaniHesaplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen  kenar1 degeri giriniz");
        System.out.println();
        System.out.println("lütfen  kenar2 degeri giriniz");
        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        System.out.println( "diktorgen  alanı \n"   + (kenar1  * kenar2) );
    }
}
