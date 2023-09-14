import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz : ");
        int tamSayi = input.nextInt();

        System.out.print("Bir ondalıklı sayı giriniz : ");
        double ondalikliSayi = input.nextDouble();

        double tamOndalik = tamSayi;
        int ondalikTam = (int) ondalikliSayi;

        System.out.println("Ondalık sayıya dönüşen tam sayı : " + tamOndalik);
        System.out.println("Tam sayıya dönüşen ondalık sayı : " + ondalikTam);







    }
}