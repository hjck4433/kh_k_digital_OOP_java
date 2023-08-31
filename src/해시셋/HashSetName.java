package 해시셋;

import java.util.Arrays;
import java.util.HashSet;

// 중복 허용 하지 않음, 순서 보장 하지 않음, 수학의 집합과 유사한 개념
public class HashSetName {
    public static void main(String[] args) {
//        String[] arr = {"H", "e", "l", "l", "o"};
//        HashSet<String> set = new HashSet<>(Arrays.asList(arr));
//        System.out.println(set);
        HashSet<String> set2 = new HashSet<>();
        set2.add("Java");
        set2.add("C");
        set2.add("C++");
        set2.add("Python");
        set2.add("Java"); // add 안됨
        for(String e :set2) System.out.print(e + " ");
    }
}
