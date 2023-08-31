package 해시맵기본;

import java.util.*;

public class HashBasic {
    public static void main(String[] args) {
        //     Key, Value
        Map<String, Integer> map = new HashMap<>();
        // 객체 저장 : key, value
        map.put("우영우", 99); 
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 70); // key가 같기 때문에 나중에 저장된 value값으로 대체 / 내부적으로 집합으로 동작 (Set)
        System.out.println("총 Entry 수 : " + map.size()); //Entry = key + value
        // 객체 찾기 : get(key), 지정된 키에 대한 값을 반환 합니다
        System.out.println(map.get("동그라미")); // hash는 인덱스를 알 수 없으므로 key값 입력
        // 향상된 for문으로 순회
        for(String key : map.keySet()) { // keySet() : key가 포함 된 Set 컬렉션 반환
            System.out.println(key + "\t" + map.get(key));
        }
        // iterator(반복자)를 사용하는 방법
//        Set<String> keySet = map.keySet(); // 중복 허용하지 않는 set 자료구조에 key를 담음
//        Iterator<String> iterator = keySet.iterator(); // Set의 반복 가능한 내부 메소드 빼냄
//        while(iterator.hasNext()) {
//            String key = iterator.next();
//            Integer value = map.get(key);
//            System.out.println(key + "\t" + value);
//        }
        // 객체 삭제 : key값으로 해당 Entry를 삭제
        map.remove("최수연");

        // 삭제 확인
        for(String key : map.keySet()) { // keySet() : key가 포함 된 Set 컬렉션 반환
            System.out.println(key + "\t" + map.get(key));
        }
    }
}
