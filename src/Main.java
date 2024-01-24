import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Girilen Sayı :");
        int num = input.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : list) {
            if (i < num && i > max) {
                max = i;
            }
            if (i > num && i < min) {
                min = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + max);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + min);
    }
}
