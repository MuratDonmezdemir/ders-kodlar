package odevlerYapildi;

import java.util.Scanner;

public class ders1_IfBloklari {


    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz..." );
        int sayi = scanner.nextInt();
        if (sayi>100){
        sayi =sayi/2;

        }

        System.out.println(sayi);
    }
}
