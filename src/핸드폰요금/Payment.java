package 핸드폰요금;
import java.util.Scanner;

public class Payment {
    private int callNum ;
    private int[] callTime = new int[callNum];
    private int y;
    private int m;

    Payment(int callNum) {
        this.callNum = callNum;
    }

    public void setCallTime() {

    }

    public int priceY(int y) {
        int price = 10;
        int sum = 0;
        for(int i = 0; i < callNum; i++){
            int call = (callTime[i] / 30) + 1;
            sum += price*call;
        }
        return y = sum;
    }
    public int priceM(int m) {
        int price = 15;
        int sum = 0;
        for(int i = 0; i < callNum; i++){
            int call = (callTime[i] / 60) + 1;
            sum += price*call;
        }
        return m = sum;
    }
    public void getPayment() {
        if(y>m) {
            System.out.println("Y" + y);
        }else if(m>y) {
            System.out.println("M" + m);
        }else {
            System.out.println("YM" + y);
        }
    }

}
