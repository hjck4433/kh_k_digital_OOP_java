package 핸드폰요금;
import java.util.Scanner;

public class Payment {
    private int callNum ; // 통화 횟수
    public int[] callTime ; // 통화 길이
    private int n = 0; // 배열 인덱스
    private int y = 0; // y요금제
    private int m = 0; // m요금제

    Payment (int callNum) { // 통화 횟수
        this.callNum = callNum;
    }
    public void setCallTime() { //통화 횟수만큼 배열 크기 지정
        callTime = new int[callNum];
    }
    public void callTimeArr(int call) { // 배열에 통화길이 대입
        callTime[n] = call;
        n++;
    }
    public void getCallTime() { // 배열 확인
        for (int e : callTime) System.out.print(e + " ");
        System.out.println();
    }

    public int priceY() { //영식 요금제 요금 구하기
        int price = 10;
        int sum = 0;
        for(int i = 0; i < callNum; i++){
            int call = (callTime[i] / 30) + 1;
            sum += price*call;
        }
        return y = sum;
    }
    public int priceM() { // 민식 요금제 요금 구하기
        int price = 15;
        int sum = 0;
        for(int i = 0; i < callNum; i++){
            int call = (callTime[i] / 60) + 1;
            sum += price*call;
        }
        return m = sum;
    }
    public void getPayment() { // 요금제 비교 후 출력
        // priceY();
        // priceM();
        if(y>m) {
            System.out.println("M " + m);
        }else if(m>y) {
            System.out.println("Y " + y);
        }else {
            System.out.println("YM " + y);
        }
    }

}
