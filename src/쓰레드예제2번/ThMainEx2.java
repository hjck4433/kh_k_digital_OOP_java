package 쓰레드예제2번;
import java.awt.*;
import static java.lang.Thread.sleep;
// 다른 쓰레드의 종료를 기다림(Join())
public class ThMainEx2 {
    public static void main(String[] args) {
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        for(int i = 0; i < 10; i++) {
//            toolkit.beep();
//            try {
//                sleep(3000);
//            } catch (InterruptedException ignored){
//            }
//        }
        SumThread sumThread = new SumThread();
        sumThread.start();
        long start = System.currentTimeMillis(); // 내가 추가한거
        try {
            sumThread.join(); // sumThread가 작업을 완료할때 까지 기다림
            System.out.println("main이 일을 하는지 확인");
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
        System.out.println("합 : " + sumThread.getSum());
        System.out.println(System.currentTimeMillis() - start); //내가 추가한거 try문들어가기 전부터 합 출력까지 밀리세컨드 확인

    }
}

class SumThread extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run() {
        for(int i = 0; i <= 2100000000; i++) {
            sum += 1;
        }
    }
}
