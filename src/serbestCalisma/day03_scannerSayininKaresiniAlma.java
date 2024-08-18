package serbestCalisma;

import java.util.Scanner;

public class day03_scannerSayininKaresiniAlma {
 //   kullanicidan bir tam sayi alip karesini yazdirin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Bir Tam Sayi Giriniz");
        int sayi = scanner.nextInt();
        System.out.println(
                "girilen sayinin karesi\n" +

                        "" +sayi * sayi);

    }
}
