package odevlerim.odevlerYapildi.alistirmalar;

import java.time.LocalDate;

public class c01_ArtikYilmiHesapla {


    public static void main(String[] args) {

        LocalDate tarih1 =LocalDate.now();
        LocalDate tarih2 =LocalDate.now();

        LocalDate yil1981 =LocalDate.of(1981,8,11);
        System.out.println(yil1981.isLeapYear());
        LocalDate yil1973 =LocalDate.of(1973,4,15);
        System.out.println(yil1973.isLeapYear());

    }
}
