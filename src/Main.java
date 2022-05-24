// Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Klavyeden okuma yapmak için Scanner nesnesini oluştur.
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");

        // nextInt() metodu ile tam sayı türünde değer okuması yapılır.

        int num = scan.nextInt();

        int adet = 0, toplam = 0;

        while (num != 0){
            toplam=(num%10)+toplam;
            num /= 10;
            ++adet;
        }
        System.out.println("Basamak Toplamı: "+toplam);
    }
}
