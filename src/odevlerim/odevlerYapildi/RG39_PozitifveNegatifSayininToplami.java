package odevlerim.odevlerYapildi;

public class RG39_PozitifveNegatifSayininToplami {

    public static void main(String[] args) {
        // Test verisi
        int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] sonuc = countPositivesSumNegative(sayilar);

        // Sonucu ekrana yazdır
        System.out.println("Pozitif sayıların sayısı: " + sonuc[0]);
        System.out.println("Negatif sayıların toplamı: " + sonuc[1]);
    }

    // Pozitif sayıların sayısını ve negatif sayıların toplamını bulan metot
    public static int[] countPositivesSumNegative(int[] sayilar) {
        // Boş bir dizi kontrolü
        if (sayilar == null || sayilar.length == 0) {
            return new int[] {}; // Boş bir dizi döndür
        }

        int pozitifSayac = 0;
        int negatifToplam = 0;

        // Her bir elemanı kontrol et
        for (int sayi : sayilar) {
            if (sayi > 0) {
                pozitifSayac++; // Pozitif sayıları say
            } else if (sayi < 0) {
                negatifToplam += sayi; // Negatif sayıları topla
            }
        }

        // Sonuçları bir dizi olarak döndür
        return new int[] {pozitifSayac, negatifToplam};
    }
}
