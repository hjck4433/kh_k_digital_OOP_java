package 전자레인지;

import java.util.Scanner;
// A = 5min B = 60s C = 10s
// 최소한의 버튼 조작으로 T 시간
// 입력 : T
// 출력 A: B: C:  // 정확하게 안떨어지면 -1
public class Microwave {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int btnA = 0, btnB = 0, btnC =0;
//        System.out.print("T : ");
//        int t = sc.nextInt();
//
//        if(t % 10 != 0) {
//            System.out.print(-1);
//        }else {
//            btnA = t / 300;
//            btnB = (t % 300) / 60;
//            btnC = ((t % 300) % 60) / 10;
//
//            System.out.printf("A:%d B:%d C:%d\n",btnA,btnB,btnC);
//        }

        // 강사님 풀이
        int t, a, b, c; // 요리시간을 초로 입력, a = 5분, b = 1분, c = 10초
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        if(t % 10 != 0) {
            System.out.println("-1");
            return;
        }

        a = t / 300; // 5분 버튼에 대한 몫 (5분 버튼이 눌려진 수)
        b = t % 300 / 60; // 1분 버튼이 눌려진 수
        c = t % 300 % 60 / 10; // 10초 버튼이 눌려진 수

        System.out.printf("%d %d %d\n",a,b,c);

    }
}
