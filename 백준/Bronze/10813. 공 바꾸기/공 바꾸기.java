import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] besk = new int[N + 1];

        for (int i = 0; i <= N; i++) {
            besk[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int j = sc.nextInt();
            int k = sc.nextInt();

            int tmp = besk[j];
            besk[j] = besk[k];
            besk[k] = tmp;
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(besk[i] + " ");
        }
    }
}