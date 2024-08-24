package odevlerim.odevlerYapildi.alistirmalar;

// Parent class
class Hayvan {
    public void nefesAl() {
        System.out.println("Hayvan nefes alıyor");
    }

    public void yemekYe() {
        System.out.println("Hayvan yemek yiyor");
    }
}

// Child class
class Kedi extends Hayvan {
    public void miyavla() {
        System.out.println("Kedi miyavlıyor");
    }
}

class Kopek extends Hayvan {
    public void havla() {
        System.out.println("Köpek havlıyor");
    }
}

// Kullanım
public class Main {
    public static void main(String[] args) {
        Kedi kedi = new Kedi();
        kedi.nefesAl();  // Hayvan nefes alıyor
        kedi.miyavla();  // Kedi miyavlıyor

        Kopek kopek = new Kopek();
        kopek.yemekYe();  // Hayvan yemek yiyor
        kopek.havla();    // Köpek havlıyor
    }
}
