package 제네릭기본;

import java.util.ArrayList;
import java.util.List;

public class GenericBasic {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        String str = (String) list.get(0); // => 뺄 때 형을 지정해 주어야 했음
        System.out.println(str);
        // 제네릭 타입으로 변환
        List<String> list2 = new ArrayList<>(); // => 만들때 미리 형을 지정
        list2.add("java"); // 1을 넣으면 에러를 잡음
        String str2 = list2.get(0);
        System.out.println(str2);
//        list2.add(0, "hello");
//        for(String e : list2) System.out.print(e + " ");
    }
}
