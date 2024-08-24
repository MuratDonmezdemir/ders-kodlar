package odevlerYapildi.alistirmalar;

public class c05varargs_kendiArasindaSayilariTopla {
    public static void main(String[] args) {
/*
verilen degisken sayidaki int argument den
ilk sayi haric geriye kalanlari toplayip
bulunan toplamdan ilk sayiyi cikartip bulunan sonucu  yazdiran bir method olusturun

 */
      islemYap (2,3,4,5)  ;
      islemYap(1,2,3,4,5,6,7,8,9);


    }
    public  static void islemYap(int ilkArgument ,int...  geriyekalanlar){

      int toplam =0;
      for (int each  :geriyekalanlar){

          toplam+=each;


        }
        System.out.println("sonuc:"+(toplam-ilkArgument));
    }
}
