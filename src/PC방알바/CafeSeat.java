package PC방알바;
import java.util.Scanner;

public class CafeSeat {
    private int customer;
    private final int[] seats = new int[100];
    private int cnt = 0;
    Scanner sc = new Scanner(System.in);

    void setCafeSeat() {
        System.out.print("손님 수 : ");
        customer = sc.nextInt();
    }
    void rejectCnt() {
        for(int i = 0; i < customer; i++) {
            int seat = sc.nextInt();
            if(seats[seat-1] > 0) cnt++;
            else seats[seat-1] = 1;
        }
        System.out.println("거절 당한 횟수 : " + cnt);
    }

}
