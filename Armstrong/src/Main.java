import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, basamakTop = 0;
        System.out.print("Sayıyı Giriniz : ");
        number = scanner.nextInt();
        int tempNumber = number;
        int basnumber;


        while (tempNumber != 0) {
            basnumber = tempNumber % 10;
            System.out.println(basnumber);
            basamakTop += basnumber;
            tempNumber /= 10;

        }
        System.out.println("basamak sayısı toplamı = " + basamakTop);
    }
}