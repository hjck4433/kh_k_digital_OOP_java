package 스트림최종연산;

import java.util.Optional;
import java.util.stream.Stream;

// 요소의 소모 :
public class StreamEx5 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
        Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");
        // Optional  NPE 방지
        Optional<String> rst1 = stream1.reduce((s1, s2) -> s1 +  "++" + s2);
        // ifPresent() : NPE가 발생하지 않으면 출력
        rst1.ifPresent(System.out::println);

        String rst2 = stream2.reduce("시작",(s1, s2)->s1 + "++" + s2);
        System.out.println(rst2);

    }
}
