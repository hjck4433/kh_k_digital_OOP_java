package Arrays클래스;
// Arrays클래스는 배열을 다루기 위한 다양한 메소드가 포함되어 있습니다.
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysClass {
    public static void main(String[] args) {
        Integer[] arr = {5, 3, 4, 7, 8, 9, 2, 1};
        // Arrays.sort(arr); // 오름차순 // 기본형으로 배열이 선어되어도 사용 가능 함
        //Arrays.sort(arr, Collections.reverseOrder()); //내림차순 // Collections는 기본형을 허용하지 않음 내림차순 정렬을 하려면 참조타입으로 배열을 선언
        //for(int e : arr) System.out.print(e +" ");

        // 정렬 오버라이딩 : 재정의
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2) return 1; // 오름 차순
                //if(o1 < o2) return 1; // 내림 차순
                return -1; // 현상태 유지
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
