package odevlerYapildi.dersler;

import java.util.Scanner;

public class c07_modulus {
    public static void main(String[] args) {

        System.out.println(85 % 6);//1
        System.out.println(28 % 8);//4
        System.out.println(28 / 8);//3
        System.out.println(1276 % 10);//6
        System.out.println(1276 / 10);

 /*
 kullanıcıdan bır tam sayı ısteyın gırılen sayının bırler basamagını yazdırın
  */
        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen bır tamsayı gırınız ...." );
        int girilenSayi = scanner.nextInt();

        System.out.println("girilen sayının bırler basamagı :"+ girilenSayi % 10);
        System.out.println("girilen sayının onlar  basamagı :"+ girilenSayi % 100);
        System.out.println("girilen sayının yuzler   basamagı :"+ girilenSayi % 1000);
// birler  , onlar , yuzler  basamagı bulmak ıcın kullanırız


/*
GIRILEN sayinın CIFT olup olmadıgını kontrol etmek ıcın
(girilenSayi % 2 ==> 0 İSE sayı ÇİFTTİR  SIFIRA eşit
degıl ıse
TEK' DIR
( girilen sayının 5  ' e BOLUNUP bolunmedıgını kontrol etmek ıcın
(gırılen sayı % 5 ==> 0 ise 5 e TAM BOLUNUR ,
sıfıra esıt degılse 5  e tam bolunmuyor derız
 */
    }
}

