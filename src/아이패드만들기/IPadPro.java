package 아이패드만들기;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static java.lang.Thread.sleep;
import static 아이패드만들기.Common.*;

public class IPadPro {
    int screen; // 11인치, 12.9인치
    int color;  // 스페이스그레이 , 실버
    int memory; // 128GB, 256GB, 512GB, 1TB
    int network; // Wi-Fi only , Wi-Fi+Cellular
    String name; // 각인서비스 시 이름 저장
    String productDate; // 제품 생산 일자
    String serialNum; // 제품 일련번호 : 제품의 고유값
    static int cnt = 0; // 클래스 소속의 변수, 몇대가 생산되었는지 확인하는 용도, 즉 클래스가 객체로 만들어진 횟수

    IPadPro(String name) {
        this.name = name;
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd"); //MM=월 mm=분
        productDate = sdf.format(now); // 생산한 년/월/일을 가져 옴
        cnt++;
        productDate += cnt; // 문자열에 생산대수를 이어 붙이기
    }

    boolean continueOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=".repeat(5) + "iPad Pro 구입하기" + "=".repeat(5));
        System.out.println("구입하시려면 yes / 종료는 quit : ");
        String isContinue = sc.next();
        if(isContinue.equalsIgnoreCase("yes")) return true; // 구입을 진행 함
        else return false; // 구입을 하지 않음
    }
    
    // 화면 사이즈 정하기
    void setScreen() { //void = 객체에 기록 이 경우에는 screen에 저장
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("디스플레이 선택 [1] 11인치 [2] 12.9인치 : ");
            /*this. 생략*/screen = sc.nextInt();
            if(screen == 1 || screen == 2) return;
            System.out.println("디스플레이를 다시 선택 하세요.");
        }
    }

    // 색상 정하기
    void setColor() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("컬러 선택 [1] 스페이스그레이 [2] 그레이 : ");
            color = sc.nextInt();
            if(color == 1 || color == 2) return;
            System.out.println("컬러를 다시 선택 하세요.");
        }
    }

    // 용량 정하기
    void setMemory() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("용량 선택 [1] 128GB [2] 256GB [3] 514GB [4] 1TB : ");
            memory = sc.nextInt();
            if(memory > 0 && memory < 5) return;
            System.out.println("용량을 다시 선택 하세요.");
        }
    }

    // 네트워크 정하기
    void setNetwork() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("네트워크 선택 [1] Wi-Fi [2] Wi-Fi+Cellular : ");
            network = sc.nextInt();
            if(network == 1 || network == 2) return;
            System.out.println("네트워크를 다시 선택 하세요.");
        }
    }

    // 각인서비스 선택
    void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("각인 서비스를 신청하시겠습니까? (yes / no) : ");
        String service = sc.nextLine();
        if(service.equalsIgnoreCase("yes")){
            System.out.print("이름을 입력 하세요 : ");
            name = sc.nextLine();
        }
    }

    // 일련번호 생성
    void setSerialNum() {
        String screenStr = (screen == 1) ? "11" : "13";
        String[] memStr = {"", "128", "256", "512", "1024"};
        String netStr = (network == 1) ? "W" : "C";
        serialNum = "iPad" + screenStr + memStr[memory] + netStr + productDate; // 일련번호 생성
    }

    // 진행도 (30초 대기)
    void progressPad() throws InterruptedException { // Interrupt 예외
        int cnt = 0;
        while(true) {
            sleep(300); // 프로그램을 잠깐 잠재움
            cnt++;
            System.out.print(" << iPad Pro 제작 중 : [" + cnt + "%] >>");
            System.out.print("\r");
            if(cnt >= 100) break;
        }
    }

    // 다른 방식으로 표현
    void progressPad2() throws InterruptedException { // Interrupt 예외
        int cnt = 40;
        int cnt2 = 0;
        while(true) {
            sleep(750); // 프로그램을 잠깐 잠재움
            cnt--;
            cnt2++;
            System.out.print(" << iPad Pro 제작 중 : [" + "■".repeat(cnt2)+ " ".repeat(cnt) + "] >>");
            System.out.print("\r");
            if(cnt <= 0) break;
        }
    }

    // 정보
    void productPad() {
        System.out.println("=".repeat(5) + PRODUCT + "사양" + "=".repeat(5));
        System.out.println("화면 크기 : " + screenType[screen]);
        System.out.println("제품 색상 : " + colorType[color]);
        System.out.println("제품 용량 : " + memType[memory]);
        System.out.println("네트워크 : " + netType[network]);
        System.out.println("이름 : " + name);
        System.out.println("일련 번호 : " + serialNum);
        System.out.println("-".repeat(40));
    }
}
