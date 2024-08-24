package odevlerim.odevlerYapildi.dersler;

public class co2_explicitNarrowing {

    public static void main(String[] args) {


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

         String fiyat1 ="23";
         String fiyat2 ="45";
        System.out.println(fiyat1 + fiyat2);


        int sonuc =Integer.parseInt(fiyat1)+Integer.parseInt(fiyat2);
        System.out.println("ıkı urun toplam fıyatı : " + sonuc);
char ch1 ='c';
        System.out.println(Character.toUpperCase(ch1));// C yazdık

        char ch2 ='M';
        System.out.println(Character.toLowerCase(ch2));// m yazdık


    }
}
