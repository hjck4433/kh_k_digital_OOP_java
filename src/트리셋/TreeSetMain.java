package 트리셋;

import java.util.Comparator;
import java.util.TreeSet;

// 검색 기능을 강화시킨 자료구조
// 데이터가 저장될 때 이진 검색 트리 형태로 저장되고, 값을 검색을 할때 inOrder(Left-Root-Right) 방식으로 탐색 함
public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(23);
        ts.add(10);
        ts.add(48);
        ts.add(15);
        ts.add(7);
        ts.add(22);
        ts.add(56);
        for(Integer e : ts) System.out.print(e + " ");
        System.out.println();

        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("10");
        ts2.add("300");
        ts2.add("2000");
        ts2.add("20");
        ts2.add("90");
        ts2.add("9999");
        ts2.add("444");
        for(String e : ts2) System.out.print(e + " ");

    }
}
