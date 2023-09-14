import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        int bir , iki, uc;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        bir = input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        iki = input.nextInt();
        System.out.print("3. Sayıyı Giriniz : ");
        uc = input.nextInt();

        int sonuc =  (bir + iki) * uc - bir;
        System.out.println("Sonuç : " + sonuc);


    }
}