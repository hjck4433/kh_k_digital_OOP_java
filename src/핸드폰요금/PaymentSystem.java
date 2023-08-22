package 핸드폰요금;
// 영식 요금제 Y : 30초 10원 (30초가 되면 2통)
// 민식 요금제 M : 60초 15원 (60초가 되면 2통)
// 첫번째 입력 : 통화 횟수 (20 미만)
// 두번째 줄 : 각 통화 시간(초단위)
// 출력은 싼 요금제를 출력 영식 요금제는 Y 60, 민식 요금제는 M 45
// 총 통화 요금이 같이 경우는 YM 총 통화 요금 표시

import java.util.Scanner;

public class PaymentSystem {
    public static void main(String[] args) {
        int[] call = new int[20]; // 통화 횟수에 대한 통환 시간을 입력 받기 위한 배열
        int yPay = 0, mPay = 0;
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // 통화 횟숫를 입력 받아 변수에 대입
        for(int i = 0; i < cnt; i++) { // 통화 횟수 당 토화 시간을 입력 받음
            call[i] = sc.nextInt();
        }
        // 총 통화 요금 구하기
        for(int i = 0; i < cnt ; i++) {
            yPay += (call[i] / 30) * 10 + 10; // 기본 한 통화가 있음
            mPay += (call[i] / 60) * 15 + 15;
        }
        if(yPay > mPay) {
            System.out.println("M " + mPay);
        }else if (yPay < mPay){
            System.out.println("Y " + yPay);
        }else {
            System.out.println("YM" + mPay);
        }
    }
}
