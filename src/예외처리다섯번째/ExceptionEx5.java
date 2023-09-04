package 예외처리다섯번째;

import java.io.IOException;

// 예외처리 미루기
public class ExceptionEx5 { // main에서 throw하면 예외처리 던지기가 됨
    public static void main(String[] args) {
        IOSample test = new IOSample();
        try {
            test.input();
            test.output();
        } catch(IOException e) {
            System.out.println("입력 에러 발생......");
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
}

class IOSample {
    private int num;
    public void input() throws IOException { // 호출한 쪽으로 예외처리를 미룸
        num = System.in.read();
    }
    public void output() {
        System.out.println(num);
    }

}