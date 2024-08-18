package serbestCalisma;

import java.util.Scanner;

public class day03_cemberinAlaniHesaplama {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen cemberın yarı capını gırınız ..");
        double yaricap = scanner.nextDouble();
        System.out.println("cemberin cevresi :"+2*3.14*yaricap);
        System.out.println("dairenin alani :"+3.14*yaricap*yaricap);

    }
}
