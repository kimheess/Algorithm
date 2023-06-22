import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A == B && A == C) { // 같은 눈이 3개가 나오면
            System.out.println(10000 + (A * 1000)); //10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
        }
        else if (A == B || A ==C) {  //같은 눈이 2개만 나오는 경우에는
            System.out.println(1000 + (A * 100)); //1,000원+(같은 눈)×100원의 상금을 받게 된다.
        }
        else if(B ==C ){
            System.out.println(1000 + (B * 100));
        }
        else { //모두 다른 눈이 나오는 경우에는
            int max = Math.max(A,B); // 좋습니다
            max = Math.max(max,C);
            System.out.println(max * 100); //(그 중 가장 큰 눈)×100원의 상금을 받게 된다.
        }
    }
}