package serbestCalisma;

import java.util.Scanner;

public class day02_scannerBilgiAlma {

    public static void main(String[] args) {

        //kullanıcıdan bılgı almak ıcın  scanner kullanırız
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ısmınızı gırınız");
        String isim =scan.nextLine();
        System.out.println(  "girilen isim\n" +
                "" + isim.toUpperCase());


    }
}
