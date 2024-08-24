package odevlerim.odevlerYapildi;

import java.util.HashMap;
import java.util.Map;

public class RG44_TekrarEdenHarfleriBulun {

    public static void main(String[] args) {
        // Test verileri
        System.out.println(duplicates("Hello World!"));  // 2
        System.out.println(duplicates("foobar"));        // 1
        System.out.println(duplicates("helicopter"));    // 1
        System.out.println(duplicates("Merhaba"));       // 1
    }

    // Tekrar eden karakterlerin sayısını bulan metot
    public static int duplicates(String str) {
        // Harflerin sayısını izlemek için bir HashMap oluştur
        Map<Character, Integer> harfSayaci = new HashMap<>();
        int tekrarEdenHarfSayisi = 0;

        // String içindeki her bir karakteri kontrol et
        for (char c : str.toCharArray()) {
            // Büyük/küçük harf duyarlılığını kaldırmak için karakterleri küçük harfe çeviriyoruz
            c = Character.toLowerCase(c);

            // Sadece harfleri saymak istiyoruz, diğer karakterleri atlıyoruz
            if (Character.isLetter(c)) {
                // Harfi harfSayaci map'ine ekle veya sayısını artır
                harfSayaci.put(c, harfSayaci.getOrDefault(c, 0) + 1);
            }
        }

        // Birden fazla geçen harflerin sayısını bul
        for (int sayi : harfSayaci.values()) {
            if (sayi > 1) {
                tekrarEdenHarfSayisi++;
            }
        }

        return tekrarEdenHarfSayisi;
    }
}