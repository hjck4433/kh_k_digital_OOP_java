package 나머지;
// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
// 입력 : 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
// 출력 : 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int b = 42; // 고정된 나누는 값
//        int[] input = new int[10]; // 입력 받을 정수 배열
//        int[] remain = new int[41]; // 나머지 값으로 나올수 잇는 정수만큼 크기의 배열
//        int cnt = 0; // 중복되지 않는 값 카운트
//
//        for(int i = 0; i < input.length; i++ ) {
//            input[i] = sc.nextInt();
//        }
//
//        for (int a : input) {
//            int num = a % b;
//            if (remain[num] == 0) {
//                cnt++;
//                remain[num] = 1;
//            }
//        }
//        System.out.print(cnt);

        // 강사님 풀이
        int[] arr = new int[42];
        int cnt = 0; // 42로 나눈 나머지가 다른 경우에 대한 총 횟수
        int input; // 입력 받은 값
        Scanner sc = new Scanner(System.in);
        System.out.print("10개의 수 입력 : ");
        for (int i = 0; i < 10; i++) {
            input = sc.nextInt();
            arr[input % 42] = 1; // 입력 받은 값을 42로 나눈 나머지에 해당하는 인덱스에 1을 대입
        }
        for (int val : arr) cnt += val;
        System.out.println(cnt);


    }
}
