package odevlerYapildi.day0001_Inheritance;

public class C02_Doktor extends C01_Personel {

   String brans ="Brans belirtilmemiş" ;




    /*
    bir class olusturdugumuz da (doktor)
    baslangic olarak doktor  class' ında personel class ında
    bulunan tum variable  ve methodlara ihtiyacımız var
    DİYORSAK
    iki ihtimal var doktor class ında da bu method ve variable ları olustururuz
    ama doktor dısında hesmsıre teknık personel idari personel
    gibi diger class lar da bu variable ve methodları
    olusturmalı bu mantıklı degil
    DOKTOR CLASS I ICIN PERSONEL CLASS INDAKII TUM
    VARİABLE VE METHODLARI INHERIT ETMEK
     bir class ın baska bır class dakı tum ozellıklerı
     baslangıc ıtıbarı ıle ınherıt etmemız ıcın o class a
     CHİLD olmalıdır
     insanlardan farklı olarak Java da CHİLD CLASS lar
     PARENT larını secerler bir class baska bır class i
     PARENT edinmek isterse EXTENDS ParentClassIsmi yazabilir

     */

    public static void main(String[] args) {
C02_Doktor doktor1 = new C02_Doktor();
//obje uzerınden kullanmamızın sebebı statıc olan main method ııcnde
//        statıc olmayan özelliklere ulasabılmek ıcın
//doktor1 objesı C02_Doktor  class ının objesı olmasına ragmen
//isim variable ı ve maas methodunu C01_Personel class ından
//kullanabılıyor cunku o class ı ınherıt ettı(extends)

        System.out.println(doktor1.brans);
        System.out.println(doktor1.isim);
        doktor1.maas ();



    }

    public  void method1(){
        System.out.println(isim);
        maas();

    }

}
