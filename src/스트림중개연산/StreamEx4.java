package 스트림중개연산;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 생성된 스트림은 중간연산을 통해 또 다른 스트림으로 변환 됩니다.
// 1. 필터링 :
// - filter() : 주어진 조건에 맞는 요소만으로 구성된 새로운 스트림 생성
// - distinct() : 중복된 요소가 제거된 새로운 스트림 생성
// 2. 스트림 변환 :
// - map() : 해당 스트림의 요소들을 함수에 인수로 전달하여, 그 반환값으로 이루어진 새로운 스트림을 만듬.
// - flatMap() : 각 요소를 변환하여 중첩된 스트림들을 평면화하여 새로운 스트림을 생성합니다.
// 3. 제한
// - limit() : 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소만으로 이루어진 새로운 스트림 생성
// - skip() : 해당 스트림의 첫 번째 요소부터 전달된 개수만큼의 요소를 제외한 나머지 요소만으로 이루어진 새로운 스트림 생성
// 4. 정렬
// - sorted() : 해당 스트림을 주어진 비교자(comparator)를 이용하여 정렬
public class StreamEx4 {
    public static void main(String[] args) {
//        IntStream stream1 = IntStream.of(7,5,5,2,1,3,4,5,6);
//        IntStream stream2 = IntStream.of(7,5,5,2,1,3,4,5,6);
//        IntStream stream3 = IntStream.of(7,5,5,2,1,3,4,5,6);
//        // 스트림의 중복된 요소 제거함
//        stream1.distinct().forEach(e -> System.out.print(e + " "));
//        System.out.println();
//        // 스트림은 한번 돌리면 사라짐
//        // stream1.filter(e-> e % 2 != 0).forEach(e -> System.out.print(e + " ")); => error
//
//        // 조건에 맞는 요소만으로 구성된 새로운 스트림 생성
//        stream2.filter(e-> e % 2 != 0).forEach(e->System.out.print(e + " "));
//        System.out.println();
//        stream3.distinct().filter(e-> e % 2 != 0).forEach(e-> System.out.print(e + " "));

//        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
//        stream.map(String::length).forEach(e -> System.out.print(e + " "));
//        System.out.println();
//
//        Stream<String> stream4 = Stream.of("I study hard", "You study Java", "I am hungry");
//        stream4.flatMap(e -> Stream.of(e.split(" "))).forEach(System.out::println);

//        IntStream stream5 = IntStream.range(0, 10);
////        stream5.forEach(System.out::println);
//        IntStream stream6 = IntStream.range(0,10);
//        IntStream stream7 = IntStream.range(0,10);
//
//        // 전달된 요소의 개수만큼 제외
//        stream5.skip(5).forEach(e -> System.out.print(e + " "));
//        System.out.println();
//        // 첫 번쨰 요소부터 전달된 개수만큼의 요소만으로 이루어진 새로운 스트림을 반환
//        stream6.limit(5).forEach(e -> System.out.print(e + " "));
//        System.out.println();
//        stream7.skip(3).limit(5).forEach(e -> System.out.print(e + " "));
//        System.out.println();
        
        Stream<String> stream8 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        Stream<String> stream9 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");

        stream8.sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();
        stream9.sorted(Comparator.reverseOrder()).forEach(s-> System.out.print(s + " "));
    }
}
