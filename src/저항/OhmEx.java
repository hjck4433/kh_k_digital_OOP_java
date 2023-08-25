package 저항;

import java.util.Scanner;

// 저항 값 구하기 : 컬러 문자열 3개를 입력 받음
// 첫번째 컬러 문자열은 10의 자리 수
// 두번째 컬리 문자열은 1의 자리 수
// 세번째 컬러 문자열은 곱하는 수
// black 0 1
// brown 1 10
// red   2 100
// orange 3 1,000
// yellow 4 10,000
// green 5 100,000
// blue 6 1,000,000
// violet 7 10,000,000
// grey 8 100,000,000
// white 9 1,000,000,000
public class OhmEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;

//        int[] multiply = new int[10];
//        for (int i = 0; i < multiply.length; i++) {
//            if (i == 0) multiply[i] = 1;
//            else multiply[i] = multiply[i-1]*10;
//        }

        String[] colorArr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        for(int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            for(int j = 0; j < colorArr.length; j++) {
                if(colorArr[j].equalsIgnoreCase(input)){
                    if(i < 2) sum += i == 0 ?  j * 10  :  j;
                    else sum *= /*multiply[j];*/ (long) Math.pow(10,j);
                }
            }
        }

        System.out.println(sum);



        // 강사님 풀이
//        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
//        int frt = 0, sec = 0, thd = 0;
//        Scanner sc = new Scanner(System.in);
//        String frtColor = sc.nextLine();
//        String secColor = sc.nextLine();
//        String thdColor = sc.nextLine();
//        for(int i = 0; i < color.length; i++) {
//            if(frtColor.equals(color[i])) frt = i; // 첫번째 입력 받은 컬러 문자열의 인덱스 값을 구함 (10의 자리 값)
//            if(secColor.equals(color[i])) sec = i; // 두번째 입력 받은 컬러 문자열의 인덱스 값을 구함 (1의 자리)
//            if(thdColor.equals(color[i])) thd = i; // 세번째 입력 받은 커러 문자열의 인덱스 값을 구함 (곱하는 수)
//        }
//        System.out.println(((long)(frt * 10) + sec) * (long) (Math.pow(10, thd))); // Math.pow() 거듭제곱
    }
}
