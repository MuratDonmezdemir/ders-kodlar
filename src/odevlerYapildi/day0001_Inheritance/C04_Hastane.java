package odevlerYapildi.day0001_Inheritance;

public class C04_Hastane {
/*
bir class olusturuldugunda parent class olarak tasarlanmasa bile
sonradan parent edinilme ihtimali dusunulerek class uyelerıne erisim
access modifier ile duzenlenebılır

EGER hiç erişilemesin dediğimiz bir variable varsa  PRİVATE  yapılır
hastane ısmı gıbı herkes gorebılsın ama deger atayamasın dıyorsanız
ENCAPSULE edıp GETTER olusturabılırsınız

ikinci yontem olarak kullanılan dıger bır method da
erişimin kolay olması içinSTATİC yapıp
degistırmenın  mumkun olmaması ıcın FINAL olarak tanımlamaktır

 */

    public String getHastaneIsmi() {
        return hastaneIsmi;
    }

    private String hastaneIsmi = "Yıldız Hastanesi";
    static final  String hastaneadresi = "Çankaya";
    static String bashekimIsmi ="Doktor menderes";

}
