package serbestCalisma;

import java.util.Scanner;

public class day03_scannerIlkHarfYazdirma {
    public static void main(String[] args) {


 // kullanicidan bir metin isteyip metnin sadece ilk
 // harfini büyük harf olarak yazdiralim


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Bir Metin Giriniz...");
        String  metin = scanner.nextLine();
        System.out.println(metin.toUpperCase().charAt(0));
        System.out.println("lütfen bir metin giriniz ..");
char ilkHarf = scanner.nextLine().toUpperCase().charAt(0);
        System.out.println("girilen metnin ilk harfi\n"+ilkHarf);
    }
}
