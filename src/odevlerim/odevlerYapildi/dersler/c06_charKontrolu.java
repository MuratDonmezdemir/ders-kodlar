package odevlerim.odevlerYapildi.dersler;

import java.util.Scanner;

public class c06_charKontrolu {
    public static void main(String[] args) {


// Kullanıcı dan bır karakter gırmesını ısteyın
// Girilen karakter sayı ıse true sayı degıl ıse false yazdırın

Scanner scan= new Scanner(System.in);
        System.out.println("luften bır karakter gırınız");

        char girilenKarakter =scan.next().charAt(0);//Girilen karakterın ılk karakterı

        System.out.println(Character.isDigit(girilenKarakter));// ılk karakter sayı mı ?
        // sayı ıse true degılse false verecek


    }
}
