package 예외처리네번째;

import java.util.Scanner;

// ArithmeticException
public class ExceptionEx4 {
    public static void main(String[] args) {
        int rst = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("나눗셈 입력 : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            try {
                rst = a / b;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력 하세요.");
                continue;
            } finally { // 예외에 상관없이 무조건 수행되는 구문 입니다
                System.out.println("결과 : " + rst);
            }
            break; // finally 안에 break를 넣으면 catch의 continue가 안됨
        }
    }
}
