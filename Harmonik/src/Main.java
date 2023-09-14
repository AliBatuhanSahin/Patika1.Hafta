import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz : ");
        int n = input.nextInt();

        double sonuç = 0;

        for (double i = 1; i <= n; i++){
            sonuç += 1/i;
        }
        System.out.print("Sonuç : " + sonuç);
    }
}