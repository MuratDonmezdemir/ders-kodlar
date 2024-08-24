package odevlerim.odevlerYapildi.alistirmalar.day03;

import java.util.Scanner;

public class c01_scannerDataCasting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz....");
      String isim = scanner.nextLine();
        System.out.println("Lütfen Soyİsminizi Giriniz...");
       String soyIsim = scanner.nextLine();
        System.out.println("Lütfen Yasinizi Giriniz ....");
         int yas = scanner.nextInt();
        System.out.println(" isminiz :"+ isim+ "soyisminiz :\n"+soyIsim+ "yasiniz :\n"+yas+"\nkaydınız basarı ile tamamlanmıstır");
    }
    
}
