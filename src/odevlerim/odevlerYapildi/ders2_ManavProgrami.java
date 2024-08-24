package odevlerim.odevlerYapildi;

import java.util.Scanner;

public class ders2_ManavProgrami {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Kac kilo Elma Alacaksiniz....");
        int elmaKg = scanner.nextInt();
        System.out.println("Kac Kilo Armut Alacaksiniz....");
        int armutKg = scanner.nextInt();
        System.out.println("Kac kilo portakal Alacaksiniz....");
        int portakalKg = scanner.nextInt();

        int elmaFiyat =2*elmaKg;
        int armutFiyat =3*armutKg;
        int portakalFiyat =4*portakalKg;
        int hesap =elmaFiyat+armutFiyat+portakalFiyat;
        System.out.println("Ödenecek Tutar:" + hesap);
    }
}
