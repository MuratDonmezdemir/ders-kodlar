package odevlerYapildi;

public class RG38_EnbuyukEnKucukSayiFarki {

    public static void main(String[] args) {
        // Test verisi
        int[] sayilar = {10, 15, 20, 2, 10, 6};
        int fark = farkBul(sayilar);
        System.out.println("En büyük ve en küçük sayı arasındaki fark: " + fark); // 18
    }

    // Array'deki en büyük ve en küçük sayı arasındaki farkı bulan metot
    public static int farkBul(int[] sayilar) {
        // Başlangıçta en küçük ve en büyük değerleri ilk elemana eşitle
        int enKucuk = sayilar[0];
        int enBuyuk = sayilar[0];

        // Tüm array elemanlarını kontrol et
        for (int i = 1; i < sayilar.length; i++) {
            if (sayilar[i] < enKucuk) {
                enKucuk = sayilar[i]; // Yeni en küçük değeri belirle
            }
            if (sayilar[i] > enBuyuk) {
                enBuyuk = sayilar[i]; // Yeni en büyük değeri belirle
            }
        }

        // En büyük ve en küçük değerler arasındaki farkı döndür
        return enBuyuk - enKucuk;
    }
}