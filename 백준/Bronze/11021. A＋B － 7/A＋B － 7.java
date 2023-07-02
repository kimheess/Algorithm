import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int D = 0;
        int C = 0;
        for (int i = 0; i < T; i++) {

            int A = sc.nextInt();
            int B = sc.nextInt();


            C = A + B;
            D++;
            System.out.println("Case #" + D + ": " + C );
        }

    }
}
