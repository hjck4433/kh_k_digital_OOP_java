package 더하기싸이클;
import java.util.Scanner;

// 26 / 2+6=8 / 68
// 68 / 6+8=14/ 84
// 84 / 8+4=12 / 42
// 42/ 4+2=6 / 26   => 4번의 사이클
// 사이클 길이 구하기
public class SumCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int input = sc.nextInt(); // 최초 숫자를 입력 받음
        int totalCnt = 0; // 총 싸이클 누적 횟수
        int calcNum = input; // 최초 입력 값이 변경되지 않도록 하기 위해서...
        int divSum = 0; // 수를 10의 자리와 1의 자리로 분리해서 더하기 위한 변수
        int newNum = 0;
        while(true) {
            totalCnt++; // break포인트 걸로 디버그
            divSum = (calcNum / 10) + (calcNum % 10); // 1의 자리와 1의 자리를 분리해서 더함
            newNum = (calcNum % 10) * 10 + (divSum % 10); //앞의 1의 자리 + 계산된 값의 1의 자리를 더함
            if (newNum == input) break;
            calcNum = newNum;
        }
        System.out.print(totalCnt);
    }
}
