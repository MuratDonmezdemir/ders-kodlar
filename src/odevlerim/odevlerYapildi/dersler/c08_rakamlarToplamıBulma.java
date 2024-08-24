package odevlerim.odevlerYapildi.dersler;

import java.util.Scanner;

public class c08_rakamlarToplamıBulma {
    public static void main(String[] args) {

 /*
 Kullanıcıdan 3 basamaklı pozıtıf bır tam sayı ısteyın
 sayının rakamlar toplamı nı bulun
 örnek ınput =245 ise output  =11
  */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen 3 basamaklı bır tam sayı gırınız ");
        int girilenSayi = scanner.nextInt();

        int rakamlarToplami =0;
        int oAnkiSayiBirlerBasamagi =0;
// 1 .adım : 245 rakamlar toplamı .0
     oAnkiSayiBirlerBasamagi =girilenSayi % 10;
     rakamlarToplami = rakamlarToplami+oAnkiSayiBirlerBasamagi;
        int sayininYeniHali =girilenSayi/10 ;
// 2. adım : sayininYeniHali =24 ,rakamlarToplami =5

 oAnkiSayiBirlerBasamagi =sayininYeniHali %10 ;
 rakamlarToplami =rakamlarToplami+oAnkiSayiBirlerBasamagi;


 sayininYeniHali =sayininYeniHali/10 ;

 rakamlarToplami =rakamlarToplami+sayininYeniHali;
        System.out.println(" Girdiğiniz " + girilenSayi + " nin rakamlar toplamı " + rakamlarToplami);

// verdiğimiz sayıları yanyana kendısı ıle toplar 2+4+5 =11 gibi
    }
}
