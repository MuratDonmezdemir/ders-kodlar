package odevlerim.odevlerYapildi;

public class c01_explicitNarrowwing {
    public static void main(String[] args) {

        int sayi1 =12;
        int sayi2 =5;
        System.out.println("sayilarin bolumu: " + sayi2/sayi1);

        System.out.println((double) sayi1/sayi2);

     /*
     bölme işlemini double cast yaptık
     bolem işlem,nin ondalıklı olması ıcın işleme giren
     sayılardan en az bırı ondalıklı sayı olmalıdır
     BASKA BIR YONTEM ıse sayılardan bırını yda ıkısını
     double cast yapmaktır


      */

        int  number =2024;
        System.out.println(number / 10);
        System.out.println(number / 100);
        System.out.println(number / 1000);



//sayıyı 10 , 100 ,1000
 //bolmek    eger bır sayının son rakamından kurtulmak istersen 10 bolebılırsın
 // eger son ıkı rakamından kurtulmak ıstersen 100 e bolebılırsın
 // eger son uc rakamından kurtulmak ıstersen 1000 e bolebılırsın


    number=number/10;
        System.out.println(number);

    }



}
