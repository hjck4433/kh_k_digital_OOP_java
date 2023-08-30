package 홀수짝수나누어담기;

import java.util.Scanner;

public class OddEven {
    private int[] inputArr = new int[7];
    private int[] odd = new int[7];
    private int[] even = new int[7];

    public void inputNum() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 7; i++) {
            int num = sc.nextInt();
            inputArr[i] = num;
        }
    }

    public void oddEvenSep() {
        for(int i = 0; i < 7; i++) {
            if(inputArr[i] % 2 == 0) {
                if(inputArr[i] == 0) even[i] = -1;
                else even[i] = inputArr[i];
            }
            else odd[i] = inputArr[i];
        }
    }

    public void printResult() {
        System.out.print("홀수 : ");
        for(int o : odd) if(o != 0) System.out.print(o + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(int e : even) if(e != 0 ) {
            if(e == -1) e++;
            System.out.print(e + " ");
        }
    }
}
