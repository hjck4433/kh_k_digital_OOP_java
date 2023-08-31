package 단어정렬하기;

import java.util.Scanner;
import java.util.TreeSet;

// 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
// n의 개수를 입력 먼저 입력 받음
//1. 길이가 짧은 것부터
//2. 길이가 같으면 사전 순으로
//3. 중복 제거
public class WordSortEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N : ");
        int n = sc.nextInt();
        TreeSet<Words> wordList = new TreeSet<>(new WordsComparator());
        for(int i = 0; i < n; i++) {
            String word = sc.next();
            wordList.add(new Words(word));
        }
        for(Words e : wordList)System.out.print(e.word + " ");
    }
}
