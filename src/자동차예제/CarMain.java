package 자동차예제;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4] 광주 : ");
        int selLoc = sc.nextInt();

        System.out.print("이동할 승객 수 입력 :" );
        int seatCount = sc.nextInt();

        System.out.print("자동차를 고르세요 [1] 스포츠카 [2] 승용차 [3] 버스 : ");
        int carSel = sc.nextInt();

        System.out.print("부가 기능 [1]ON [2]OFF : ");
        int selExtra = sc.nextInt();

        switch(carSel) {
            case 1 :
                SportsCar sportsCar = new SportsCar("페라리");
                if(selExtra == 1) sportsCar.isExtra(true);
                else sportsCar.isExtra(false);

                sportsCar.setArea(selLoc);
                sportsCar.setSeatCount(seatCount);
                sportsCar.setTotalC();
                sportsCar.setTotalD();
                sportsCar.setRefill();
                sportsCar.setCost();
                sportsCar.setTime();
                sportsCar.getInfo();
                break;
            case 2 :
                Sedan sedan = new Sedan("GV80");
                if(selExtra == 1) {
                    sedan.isExtra(true);
                }else sedan.isExtra(false);

                sedan.setArea(selLoc);
                sedan.setSeatCount(seatCount);
                sedan.setTotalC();
                sedan.setTotalD();
                sedan.setRefill();
                sedan.setCost();
                sedan.setTime();
                sedan.getInfo();
                break;
            case 3 :
                Bus bus = new Bus("관광버스");
                if(selExtra == 1) {
                    bus.isExtra(true);
                }else bus.isExtra(false);

                bus.setArea(selLoc);
                bus.setSeatCount(seatCount);
                bus.setTotalC();
                bus.setTotalD();
                bus.setRefill();
                bus.setCost();
                bus.setTime();
                bus.getInfo();
                break;
        }



    }
}
