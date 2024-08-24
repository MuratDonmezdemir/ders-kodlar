package odevlerYapildi.alistirmalar;

import java.time.LocalDate;
import java.time.Period;

public class c04_ikiTarihArasi_Period_Hesaplari1 {

    public static void main(String[] args) {

        LocalDate bugun =LocalDate.now();
        LocalDate dogumGunu =LocalDate.of(2014,2,5);
        Period yas = Period.between(dogumGunu,bugun);
        System.out.println(yas);
        yas.getYears();
        yas.getMonths();

    }
}
