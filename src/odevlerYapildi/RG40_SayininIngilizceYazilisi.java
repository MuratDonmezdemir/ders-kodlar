package odevlerYapildi;

public class RG40_SayininIngilizceYazilisi {

    public static void main(String[] args) {
        // Test verileri
        System.out.println(numToEng(0));    // zero
        System.out.println(numToEng(18));   // eighteen
        System.out.println(numToEng(126));  // one hundred twenty six
        System.out.println(numToEng(909));  // nine hundred nine
    }

    // Sayıyı İngilizce yazıya çeviren metot
    public static String numToEng(int num) {
        if (num == 0) {
            return "zero";
        }

        String[] birler = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] onlar = {"", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] yirmidenSonraOnlar = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        String sonuc = "";

        // Yüzler basamağı
        if (num >= 100) {
            sonuc += birler[num / 100] + " hundred";
            num %= 100;
            if (num > 0) {
                sonuc += " ";
            }
        }

        // Onlar basamağı
        if (num >= 20) {
            sonuc += yirmidenSonraOnlar[num / 10];
            num %= 10;
            if (num > 0) {
                sonuc += " ";
            }
        } else if (num >= 10) {
            sonuc += onlar[num - 10];
            return sonuc; // Eğer 10-19 arasındaysa, metot burada bitiyor
        }

        // Birler basamağı
        sonuc += birler[num];

        return sonuc;
    }
}