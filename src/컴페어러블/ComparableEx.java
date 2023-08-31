package 컴페어러블;

import java.util.TreeSet;

// Comparable과 Comparator는 클래스에 대한 정렬을 구현 할 수 있도록 해주는 인터페이스
public class ComparableEx {
    public static void main(String[] args) {
        TreeSet<CarComp> list = new TreeSet<>();
        list.add(new CarComp("싼타페",2016, "white"));
        list.add(new CarComp("쏘렌토",2012,"grey"));
        list.add(new CarComp("그랜저", 2018, "red"));
        list.add(new CarComp("코나",2016, "blue"));
        list.add(new CarComp("셀토스",2016, "pink"));
        for(CarComp e : list) {
            System.out.println("이름 : " + e.modelName);
            System.out.println("연식 : " + e.modelYear);
            System.out.println("색상 : " + e.color);
            System.out.println("-".repeat(25));
        };
    }
}
