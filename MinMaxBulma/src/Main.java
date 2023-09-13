import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        int adet = input.nextInt();

        int min = 0;
        int max = 0;
        int sayi;

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". Sayıyı Giriniz : ");
            sayi = input.nextInt();

            if (sayi < min || min ==0) {
                min = sayi;
            }
            if (sayi > max) {
                max = sayi;
            }
        }
        System.out.println("En Büyük Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);
    }
}