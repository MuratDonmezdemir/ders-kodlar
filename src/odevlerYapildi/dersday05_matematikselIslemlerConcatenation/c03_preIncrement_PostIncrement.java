package odevlerYapildi.dersday05_matematikselIslemlerConcatenation;

public class c03_preIncrement_PostIncrement {
    public static void main(String[] args) {


        int a =20;
        // a nınn degerını olusturdugunuz bır b variable atayın
        //sonra a yı bır arttırın
        int b =a;// a nın degerını  b ye atadık
        //sonra da bir arttıracagız
        a++;
        System.out.println("13 satırda a :"+ a + " \n b :" +b );
         a=20;
         // önce a 1 artırrın sonra a nın degerını b ye atayın
         a++;
         b=a;

        System.out.println("19 satırda a :"+ a + " \n b :" +b );

        a=20;
        // a  nın degerını yazdırın sonra a nın degerını 1 arttırın

        System.out.println(" 24 satırda a degerı:"+  a);
        a++;
        System.out.println(" 26  satırda a  degerı = " + a);

        a=20;

        // a nın degerını  1 arttır sonra da yazdırın

        a++;
        System.out.println("33  satırda a  degeri = " + a);


    }
}
