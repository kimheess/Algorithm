
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();   //시작
        int B = sc.nextInt();   //끝

        int[] arr = new int[1002];

        int count = 1;

        //1 22 333 4444 배열 입력
        for(int i=1; i<= 1000; i++){
            for (int j = 0; j < i; j++) {
                if (count == 1001) {
                    break;
                }
                arr[count] = i;
                count++;
            }
        }
        int sum = 0;

        for (int i = A; i <= B; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

}

}
