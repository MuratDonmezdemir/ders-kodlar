package odevlerYapildi;

import java.util.Scanner;

public class ders1_DikdortgenAlani {
    public static void main(String[] args) {

     Scanner scanner =new Scanner(System.in);
        System.out.println("kısa kenari giriniz");
        int kisaKenar = scanner.nextInt();

        System.out.println("uzun kenari giriniz");
        int uzunKenar  = scanner.nextInt();
        int  alan =kisaKenar*uzunKenar;
        System.out.println("diktorgenın alanı :"+alan);

    }





}
