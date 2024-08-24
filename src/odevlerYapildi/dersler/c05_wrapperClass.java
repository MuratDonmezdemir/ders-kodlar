package odevlerYapildi.dersler;

public class c05_wrapperClass {
    public static void main(String[] args) {

        String str =  "Java Candir";
        // Non-Primitive Data turleri , Hem deger ,Hem de Hazır Methodlar
        // Barındırırlar
        System.out.println(str = str.toLowerCase());// kelime yi kucuk  harfe cevirecek
        System.out.println(str.toUpperCase());// kelime yi buyuk harfe cevirecek
// Primitive Data turlerı ıcın hazır methodlar yoktur
// java primitive data turlerınde bazı methodlar kullanamabılmemız ıcın
// Wrapper classlar olusturmustur
//Boolen ,Character,Byte ;Short ,Integer ,Long, Float ,Double
// bunlar buyuk harfle baslar


int sayi =10;

Integer sayiWrapper =sayi;
 sayi =sayiWrapper ;

        System.out.println(sayiWrapper);
/*
Primitive  Variable lar ile aynı data turunun wrapper class ındakı varıable lar
arasında gecıs mumkundur

 */

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

String fiyat1 ="23";
String fiyat2 ="45";
// ıkı urun fıyatını toplayın
        System.out.println(fiyat1 + fiyat2);// 2 si de String oldugu ıcın toplamaz bırlestırır
                                             // yani 2345 yazdırır

        System.out.println(Integer.parseInt(fiyat1) + Integer.parseInt(fiyat2));
int sonuc =Integer.parseInt(fiyat1)+Integer.parseInt(fiyat2);// verilen String deger
        // int cevırdık
        System.out.println(sonuc);

        char chr1 ='c';
 // ch1 i buyuk harf olarak yazdırın

        System.out.println(Character.toUpperCase(chr1));// C yazdık

char chr2 ='M';
        System.out.println(Character.toLowerCase(chr2));// m yazdık

    }
}
