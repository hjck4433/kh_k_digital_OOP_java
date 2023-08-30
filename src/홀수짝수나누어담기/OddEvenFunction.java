package 홀수짝수나누어담기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 강사님 풀이
public class OddEvenFunction {
    int[] input = new int[7];
    int[] even = new int[7];
    int[] odd = new int[7];
    int eIdx = 0; // 짝수에 대한 배열 인덱스
    int oIdx = 0; // 홀수에 대한 배열 인덱스

    //ArrayList 활용
    List<Integer> input2 = new ArrayList<>();
    List<Integer> even2 = new ArrayList<>();
    List<Integer> odd2 = new ArrayList<>();


    // 7개의 정수를 입력 받아서 배열에 넣기
    public void inputFunc() {
        System.out.print("입력 : ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 7; i++) {
            input[i] = sc.nextInt();
        }
    }

    public void oddEvenCalc() {
        for(int i = 0; i < 7; i++ ){
            if(input[i] % 2 == 0)even[eIdx++] = input[i];
            else odd[oIdx++] = input[i];
        }
    }
    public void oddEvenOutput() {
        System.out.print("홀수 : ");
        for(int i = 0; i < oIdx; i++) System.out.printf("%2d", odd[i]);
        System.out.println();
        System.out.print("짝수 : ");
        for(int i = 0; i < eIdx; i++) System.out.printf("%2d", even[i]);
    }


    /// ArrayList 활용
    public void listInputFunc() {
        System.out.print("입력 : ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 7; i++) {
            input2.add(sc.nextInt());
        }
    }
    public void listOddEvenCalc() {
        for(Integer e: input2) {
            if(e % 2 == 0) even2.add(e);
            else odd2.add(e);
        }
    }
    public void listOddEvenOutput() {
        System.out.print("홀수 : ");
        for(Integer o : odd2) System.out.print(o + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(Integer e : even2) System.out.print(e + " ");
    }
}
