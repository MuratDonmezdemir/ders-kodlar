package odevlerYapildi;

public class RG43_AlfabedeArdardaGelmeyenHarfiBulma {

    public static void main(String[] args) {
        // Test verileri
        System.out.println(kayipHarfler("abdefg"));   // c
        System.out.println(kayipHarfler("mnopqs"));   // r
        System.out.println(kayipHarfler("abcdefgh")); // Sıralı Harfler
    }

    // Kelimedeki eksik harfi bulan metot
    public static String kayipHarfler(String kelime) {
        for (int i = 0; i < kelime.length() - 1; i++) {
            // Mevcut harf ile bir sonraki harf arasındaki farkı kontrol et
            if (kelime.charAt(i + 1) - kelime.charAt(i) != 1) {
                // Eğer fark 1 değilse, eksik harfi döndür
                return String.valueOf((char) (kelime.charAt(i) + 1));
            }
        }
        // Eğer eksik harf yoksa, "Sıralı Harfler" döndür
        return "Sıralı Harfler";
    }
}