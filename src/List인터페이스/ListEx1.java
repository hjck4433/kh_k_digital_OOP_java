package List인터페이스;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
// 리스트 인터페이스는 ArrayList, Linked List, Vector의 부모로 인터페이스로 구현되어 있음
// 리스트 구조는 배열과 유사하고 차이점으로 동적으로 크기가 변한다는 점
// ArrayList, Linked List, Vector 거의 동일한 메소드를 가지고 있어 코드 변환이 자유로움
// ArrayList :  리스트 타입의 대표적인 자료 구조(특별한 경우가 아니면 ArrayList 사용) // 삽입이 빈번하게 일어난다면 Linked List
// - 검색이 빈번한 경우 효율적이며, 맨 뒤에 입력이 일어나는 경우에는 효과적임
public class ListEx1 {
    public static void main(String[] args) {
        String[] arr = {"1000", "2000", "300", "20", "9999", "299", "10"};
        // Arrays.asList(배열 변수) : 이미 만들어진 배열을 ArrayList에 추가
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.add("100"); // List에 값을 추가 (add())
        list.add("200");
        list.add("300");
        System.out.println(list);
        // 특정 위치에 값을 가져 올 때 : get(index)
        System.out.println(list.get(2)); // list 크기만큼만 검색 가능
        // List의 크기를 가져올 떄 : size()
        System.out.println(list.size());
        // List 내에 해당하는 항목이 있는지 판별
        System.out.println("포함 여부 확인 : " + list.contains("142")); // false
        // remove(객체) : List에서 객체에 해당하는 항목을 삭제하고 그 결과를 반환
        // remove(인덱스) : 해당 인덱스의 값을 삭제하고 삭제된 값을 반환
        System.out.println("삭제 성공 여부 : " + list.remove(2));
        System.out.println(list);
        // sort(Comparator. naturalOrder() / reverseOrder()) : 정렬
        list.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println(list);
        list.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println(list);


        Comparator<String> nameComp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1;
                return -1;
            }
        };
        list.sort(nameComp);
        System.out.println(list);

        String[] fruit = {"Kiwi", "Orange", "APple", "Banana", "Melon",
                "Mango", "Watermelon", "Cherry", "Plum", "Peach", "Abbbbbbbb"};
        List<String> fruits = new ArrayList<>(Arrays.asList(fruit));
        fruits.sort(Comparator.naturalOrder());
        System.out.println(fruits);
    }
}
