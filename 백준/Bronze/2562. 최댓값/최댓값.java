import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxValue = 0;
        int maxIndex = 0;

        for (int i = 1; i <= 9; i++) {
            int n = sc.nextInt();

            if (maxValue < n) {
                maxValue = n;
                maxIndex = i;
            }
        }
        System.out.println(maxValue);
        System.out.println(maxIndex);
    }
}