package serbestCalisma;

import java.util.Arrays;

public class day01_ {
    public static void main(String[] args) {


        String str = "java candir";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.equals("java"));
        System.out.println(str.contains("candir"));


        System.out.println(str.charAt(02));
        System.out.println(str.length());
        System.out.println(str.substring(0,str.length()-2));
        System.out.println(str.replace("java","pyton"));
        int not  = 10;
        int Not =20;
        int Not2 =30;
        int NOT=40;
        System.out.println(not+NOT+Not2+NOT);
        System.out.println(str.matches("not java"));
        String str2 ;
        str2= "java guzeldir\n" +
                "java yani";
        System.out.println(str2);


    }






}
