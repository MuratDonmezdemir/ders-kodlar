package odevlerim.odevlerYapildi.dersler;

import java.util.Scanner;

public class c09_8BasamakliSayininRakamlarToplami {


    public static void main(String[] args) {

        // Kullanıcıdan 8 basamaklı pozitif bir tamsayı isteyin
        // Sayının rakamlar toplamını bulun
        // Örnek input = 12345678 ise output = 36

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 8 basamaklı pozitif bir tamsayı giriniz...");
        int girilenSayi = scanner.nextInt();

        int rakamlarToplami = 0;
        int oAnkiSayininBirlerBasamagi;

        // 1. adım
        oAnkiSayininBirlerBasamagi = girilenSayi % 10;
        rakamlarToplami += oAnkiSayininBirlerBasamagi;
        int sayininYeniHali = girilenSayi / 10;

        // 2. adım
        oAnkiSayininBirlerBasamagi = sayininYeniHali % 10;
        rakamlarToplami += oAnkiSayininBirlerBasamagi;
        sayininYeniHali /= 10;

        // 3. adım
        oAnkiSayininBirlerBasamagi = sayininYeniHali % 10;
        rakamlarToplami += oAnkiSayininBirlerBasamagi;
        sayininYeniHali /= 10;

        // 4. adım
        oAnkiSayininBirlerBasamagi = sayininYeniHali % 10;
        rakamlarToplami += oAnkiSayininBirlerBasamagi;
        sayininYeniHali /= 10;

        // 5. adım
        oAnkiSayininBirlerBasamagi = sayininYeniHali % 10;
        rakamlarToplami += oAnkiSayininBirlerBasamagi;
        sayininYeniHali /= 10;

        // 6. adım
        oAnkiSayininBirlerBasamagi = sayininYeniHali % 10;
        rakamlarToplami += oAnkiSayininBirlerBasamagi;
        sayininYeniHali /= 10;

        // 7. adım
        oAnkiSayininBirlerBasamagi = sayininYeniHali % 10;
        rakamlarToplami += oAnkiSayininBirlerBasamagi;
        sayininYeniHali /= 10;

        // 8. adım
        rakamlarToplami += sayininYeniHali;

        System.out.println("Girdiğiniz " + girilenSayi + "'nin rakamlar toplamı: " + rakamlarToplami);
    }
}
