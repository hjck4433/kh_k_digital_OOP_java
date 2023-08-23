package PC방알바;
import java.util.Scanner;

// 인원 수
// 예약 좌석 번호
// 결과는 거절 횟수 출력
public class NetCafeMain {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("손님 수 : ");
//        int n = sc.nextInt();
//        // 좌석 배열
//        int[] seats = new int[100];
//        // 거절 횟수
//        int cnt = 0;
//
//        for(int i = 0; i < n; i++) {
//            int selSeat = sc.nextInt();
//            if(seats[selSeat-1] > 0) cnt++; // 사용 중이면 거절 횟수 증가
//            else seats[selSeat-1] = 1; // 사용 중으로 변경
//        }
//        System.out.println("거절 당한 수 : " + cnt);

//        CafeSeat cafeSeat = new CafeSeat();
//        cafeSeat.setCafeSeat();
//        cafeSeat.rejectCnt();

        // 강사님 풀이
        int[] pcRoom = new int[100];
        int rejectCnt = 0, seatNum;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 인원수를 입력 받음
        for (int i = 0; i < num ; i++) {
            seatNum = sc.nextInt();
            if(pcRoom[seatNum-1] == 1)rejectCnt++;
            else pcRoom[seatNum-1] = 1;
        }
        System.out.println(rejectCnt);

    }
}
