package X보다작은수;
// 첫째줄에 N과 X가 주어 짐
// 첫줄: 10 5
// 둘째줄 : 1 10 4 9 2 3 8 5 7 6
// 결과 : 1 4 2 3

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallerThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("입력 : ");
//        final int N = sc.nextInt();
//        final int X = sc.nextInt();
//
//        List<Integer> numList = new ArrayList<>();
//        for(int i = 0; i < N; i++) numList.add(sc.nextInt());
//
//        System.out.print("X보다 작은 수 :");
//        for(Integer i : numList) if(i < X) System.out.print(i + " ");
//        System.out.println();
//        numList.stream().filter(n-> n < X).forEach(e -> System.out.print(e + " "));

        // 강사님 풀이
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt(); // 배열의 개수
        int x = sc.nextInt(); // 크기를 비교하는 기준 값 (미만 값을 찾음)
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt()); // list에 값을 추가함
            if(list.get(i) < x) System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}
