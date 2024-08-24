package odevlerim.odevlerYapildi;

public class RG45_EmailKontrol {

    public static void main(String[] args) {
        // Test verileri
        System.out.println(validateEmail("@gmail.com"));       // false
        System.out.println(validateEmail("gmail"));            // false
        System.out.println(validateEmail("hello@gmail"));      // false
        System.out.println(validateEmail("hello@edabit.com")); // true
    }

    // E-posta adresini kontrol eden metot
    public static boolean validateEmail(String email) {
        // @ işareti olmalı ve en az bir karakterden oluşmalı
        int atIndex = email.indexOf('@');
        if (atIndex <= 0) {
            return false;
        }

        // . işareti @ işaretinden sonra olmalı
        int dotIndex = email.indexOf('.', atIndex);
        if (dotIndex <= atIndex + 1) {
            return false;
        }

        // Eğer tüm koşullar sağlanıyorsa, e-posta geçerlidir
        return true;
    }
}