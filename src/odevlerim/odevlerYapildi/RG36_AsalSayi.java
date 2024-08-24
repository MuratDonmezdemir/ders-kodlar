package odevlerim.odevlerYapildi;

public class RG36_AsalSayi {

    public static void main(String[] args) {
        // Test verileri
        System.out.println(isPrime(31)); // true
        System.out.println(isPrime(18)); // false
    }

    // Asal sayı kontrolü yapan metot
    public static boolean isPrime(int number) {
        // 1'den küçük sayılar asal değildir
        if (number <= 1) {
            return false;
        }

        // 2'den büyük sayılar için kontrol
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) { // Eğer bir böleni varsa asal değildir
                return false;
            }
        }

        return true; // Hiçbir böleni yoksa asaldır
    }
}