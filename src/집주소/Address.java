package 집주소;

import java.util.Scanner;
// 1 = 2 / 2 = 3 / 3...0 = 4
// 숫자를 입력
// 해당숫자의 몇 칸을 차지하는 지를 출력하는 문제
// 0을 입력하면 종료

public class Address {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String nums = "";
        while(true) {
            String addNum = sc.next();
            if (addNum.equals("0")) break;
            else {
                nums += addNum + ",";
            }
        }
        //System.out.print(nums);
        String[] addArr = nums.split(",");

        for(int i = 0; i < addArr.length; i++) {
            int sum = 1;
            String add = addArr[i];
            for(int j = 0; j < add.length() ; j++) {
                if(add.charAt(j) == '1') sum += 3;
                else if(add.charAt(j) == '0') sum += 5;
                else sum += 4;
            }
            System.out.println(sum);
        }
        
        // 강사님 풀이
        // 각 숫자가 자치하는 자리수를 배열로 만들기
//        int[] numSize = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};
//        int sum = 0; // 입력 받은 수가 차지하는 총 자리수
//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            String number = sc.next();
//            if(number.equals("0"))break; // 0이 입력 되면 끝남
//            for(int i = 0; i < number.length(); i++) {
//                sum += numSize[number.charAt(i) - '0'] + 1; // 뒤에 1을 더하는 이유는 각 숫자마다 여백이 1칸
//            }
//            System.out.println(sum + 1); // 1을 더하는 이유는 처음 공백을 더해 줌
//            sum = 0; // 다음 계산을 위해 sum 변수를 초기화 함
//        }
    }
}
