package 디폴트메소드_익명객체;

import java.util.Scanner;

public class DefaultMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("제품 선택 [1]Audio [2]TV : ");
        int sel = sc.nextInt();
        RemoteControl rc;
        if(sel == 1) {
            rc = new Audio();
            rc.turnOn();
            rc.setVolume(20);
            rc.setMute(true);
            RemoteControl.changeBattery();
        }else {
            rc = new Television();
            rc.turnOn();
            rc.setVolume(30);
        }

        //익명객체
        RemoteControl ps5 = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("플스5 켭니다");
            }

            @Override
            public void turnOFF() {
                System.out.println("플스5 끕니다");
            }

            @Override
            public void setVolume(int vol) {

            }
        };
        ps5.turnOn();
        ps5.turnOFF();
    }
}
