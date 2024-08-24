package odevlerim.odevlerYapildi;

public class RG37_KonusmaDiliniHackerDilineCevirme {

    public static void main(String[] args) {
        // Test verisi
        String sonuc = hackerDili("javayı severim");
        System.out.println(sonuc); // j4v4yı 53v3r1m
    }

    // Metni 'hacker' diline çeviren metot
    public static String hackerDili(String metin) {
        // Metni karakter dizisine dönüştür
        char[] karakterler = metin.toCharArray();

        // Her bir karakteri kontrol edip değiştirelim
        for (int i = 0; i < karakterler.length; i++) {
            switch (karakterler[i]) {
                case 's':
                    karakterler[i] = '5';
                    break;
                case 'a':
                    karakterler[i] = '4';
                    break;
                case 'e':
                    karakterler[i] = '3';
                    break;
                case 'i':
                    karakterler[i] = '1';
                    break;
                case 'o':
                    karakterler[i] = '0';
                    break;
                // Büyük harfler için de eklemek istersen ekleyebilirsin:
                // case 'S': karakterler[i] = '5'; break;
                // case 'A': karakterler[i] = '4'; break;
                // case 'E': karakterler[i] = '3'; break;
                // case 'I': karakterler[i] = '1'; break;
                // case 'O': karakterler[i] = '0'; break;
            }
        }

        // Karakter dizisini tekrar stringe dönüştür ve döndür
        return new String(karakterler);
    }
}