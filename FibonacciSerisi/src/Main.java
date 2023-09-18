import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Elemanlı Fibonacci serisi olsun : ");
        int veri = input.nextInt();

        int s1 = 0;
        int s2 = 1;
        int toplam = 0;

        for (int i = 1; i <= veri; i++){
            System.out.print(s1 + ",");
            toplam = s1 + s2;
            s1 = s2;
            s2 = toplam;
        }
    }
}