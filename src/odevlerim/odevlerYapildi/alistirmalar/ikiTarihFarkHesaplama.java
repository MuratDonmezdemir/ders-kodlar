package odevlerim.odevlerYapildi.alistirmalar;

import java.time.LocalDate;
import java.time.Period;

public class ikiTarihFarkHesaplama {

    public static void main(String[] args) {
        // Başlangıç ve bitiş tarihlerini tanımla
        LocalDate startDate = LocalDate.of(2017, 8, 11);
        LocalDate endDate = LocalDate.of(2014, 2, 5);

        // İki tarih arasındaki farkı hesapla
        Period period = Period.between(startDate, endDate);

        // Sonuçları yazdır
        System.out.println(" Yıl : " + period.getYears());
        System.out.println(" Ay : " + period.getMonths());
        System.out.println(" Gün : " + period.getDays());
    }
}