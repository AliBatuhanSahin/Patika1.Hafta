import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayı : ");
        n = input.nextInt();
        System.out.print("Üs sayısı : ");
        k = input.nextInt();


        int toplam = 1;
        for (int i = 1; i <= k; i++){
            toplam *= n;
        }
        System.out.println("Sonuç : " + toplam);
    }
}