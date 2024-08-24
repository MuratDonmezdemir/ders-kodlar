package odevlerim.odevlerYapildi;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;


public class ikiTarihArasiHesapla {
    public static void main(String[] args) {
        // Kullanıcıdan başlangıç tarihini al
        String startYear = JOptionPane.showInputDialog("Başlangıç yılı:");
        String startMonth = JOptionPane.showInputDialog("Başlangıç ayı:");
        String startDay = JOptionPane.showInputDialog("Başlangıç günü:");

        // Kullanıcıdan bitiş tarihini al
        String endYear = JOptionPane.showInputDialog("Bitiş yılı:");
        String endMonth = JOptionPane.showInputDialog("Bitiş ayı:");
        String endDay = JOptionPane.showInputDialog("Bitiş günü:");

        // Tarihleri LocalDate olarak oluştur
        LocalDate startDate = LocalDate.of(Integer.parseInt(startYear), Integer.parseInt(startMonth), Integer.parseInt(startDay));
        LocalDate endDate = LocalDate.of(Integer.parseInt(endYear), Integer.parseInt(endMonth), Integer.parseInt(endDay));

        // İki tarih arasındaki farkı hesapla
        Period period = Period.between(startDate, endDate);

        // Sonuçları JOptionPane ile göster
        String message = "İki tarih arasında " + period.getYears() + " yıl, " +
                period.getMonths() + " ay, " +
                period.getDays() + " gün fark vardır.";
        JOptionPane.showMessageDialog(null, message, "Tarih Farkı", JOptionPane.INFORMATION_MESSAGE);
    }
}