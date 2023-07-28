import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    int[] check = new int[42];

    int answer=0;

    for(int i =0; i<10; i++){
        int n = sc.nextInt()% 42;
        if (check[n] == 0) {
            check[n] = 1;
            answer++;
        }
    }
        System.out.println(answer);
}
}