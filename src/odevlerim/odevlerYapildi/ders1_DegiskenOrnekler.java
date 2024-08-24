package odevlerim.odevlerYapildi;

import java.util.Scanner;

public class ders1_DegiskenOrnekler {

    public static void main(String[] args) {


        Scanner   scanner =new Scanner(System.in);
        System.out.println("birinci sayiyi Giriniz:");
        int sayi1 = scanner.nextInt();
        System.out.println("ikinci sayiyi Giriniz:");
        int sayi2 = scanner.nextInt();

int sonuc =sayi1+sayi2;
        System.out.println("sonuc = " + sonuc);


sonuc =sayi1*sayi2;
        System.out.println("sonuc carpma = " + sonuc);
sonuc =sayi1-sayi2;
        System.out.println("sonuc  cıkarma= " + sonuc);



    }




}
