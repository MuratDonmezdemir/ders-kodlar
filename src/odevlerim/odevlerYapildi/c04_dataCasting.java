package odevlerim.odevlerYapildi;

import java.util.Scanner;

public class c04_dataCasting {
    public static void main(String[] args) {
        // kullanıcıdan ıkı double sayi alin , ilk sayiyi ikinci sayiya bölün
        //ve bolum ıslemının sonucunun tamsayi kısmını yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Ondalikli İlk Sayiyi giriniz...");
     double   ilkSayi =scan.nextDouble();
        System.out.println("lütfen ondalikli  2 Nci Sayiyi Giriniz..." );
        double ikinciSayi  = scan.nextDouble();
        double bolum =ilkSayi/ikinciSayi;


        System.out.println("bolum : " +(int) bolum);
    }
}
