package 핸드폰요금;

public class Payment {
    private int callNum ; // 통화 횟수
    private int[] callTime = new int[20] ; // 통화 시간 배열 최대 20까지 가능
    private int n = 0; // 배열 인덱스
    private int y = 0; // y요금제
    private int m = 0; // m요금제

    //초기 설정
    Payment (int callNum) { // 통화 횟수
        this.callNum = callNum;
    }

    // 배열에 각 통화길이 대입
    public void callTimeArr(int call) {
        callTime[n] = call;
        n++;
    }
    // callTime 배열 출력
    public void getCallTime() {
        for (int e : callTime) System.out.print(e + " ");
        System.out.println();
    }

//    //영식 요금제 요금 구하기
//    public void priceY() {
//        final int price = 10;
//        int sum = 0;
//        for(int i = 0; i < callNum; i++){
//            int call = (callTime[i] / 30) + 1;
//            sum += price*call;
//        }
//        y = sum;
//    }
//    // 민식 요금제 요금 구하기
//    public void priceM() { // 민식 요금제 요금 구하기
//        final int price = 15;
//        int sum = 0;
//        for(int i = 0; i < callNum; i++){
//            int call = (callTime[i] / 60) + 1;
//            sum += price*call;
//        }
//        m = sum;
//    }

    // 각 요금제 요금 구하기
    public void price() {
        int priceY = 10; int priceM = 15;
        int sumY = 0; int sumM = 0;
        for(int i = 0; i < callNum; i++){
            // 영식 요금제
            int callY = (callTime[i] / 30) + 1;
            sumY += priceY * callY;
            //민식 요금제
            int callM = (callTime[i] / 60) + 1;
            sumM += priceM * callM;
        }
        y = sumY;
        m = sumM;
    }

    // 요금제 비교 후 출력
    public void cheaperPayment() {
//        priceY();
//        priceM();
        price();
        if(y>m) {
            System.out.println("M " + m);
        }else if(m>y) {
            System.out.println("Y " + y);
        }else {
            System.out.println("YM " + y);
        }
    }

}
