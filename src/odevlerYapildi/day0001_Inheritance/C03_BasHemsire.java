package odevlerYapildi.day0001_Inheritance;

public class C03_BasHemsire extends C01_Personel {


    @Override
    public String toString() {
        return "C01_Personel{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                ", telefon='" + telefon + '\'' +
                ", statu='" + statu + '\'' +
                ", nobet ='" + nobet + '\'' +
                '}';
    }

    String statu = "bashemsıre";
    String nobet = "hafta da bir Gün";

    public static void main(String[] args) {


        C03_BasHemsire basHemsire1 = new C03_BasHemsire();
        basHemsire1.isim = "Nalan";
        basHemsire1.adres = "Çankaya";
        basHemsire1.dogumTarihi = " 1.1.1971";
        basHemsire1.telefon = "02322555555";


        System.out.println(basHemsire1);


        basHemsire1.maas();
       /*
       -child class baslangıc ıtıbarı ıle Parent class daki tum ozelliklere  variable ve
       method sahip olur
       -Child class Isterse parent class  bazı ozellikleri kendisine uyarlayabılır
       (  maas() methodu ve statu gibi)
       -Child class isterse  parent class da olmayan bazı ozellıklerı de  ekleyebılır
(nobet gibi)
        */
    }

    @Override
    public void maas() {
        System.out.println("Bashemsireler ıcın mınımum maas 21.000 tl dir");
    }
}
