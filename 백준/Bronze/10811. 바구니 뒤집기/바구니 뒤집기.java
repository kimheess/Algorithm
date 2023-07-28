import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N +1];

        for (int i = 0; i < N + 1; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < M; i++) {
            int lt = sc.nextInt();
            int rt = sc.nextInt();

            while (lt < rt) {
                int tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;

                lt++;
                rt--;
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
