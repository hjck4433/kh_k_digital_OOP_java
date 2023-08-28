package 자동차예제;

public abstract class Car {
    public int speed; // 속도
    int fuelE; // 연비
    int fuelTank; // 연료탱크
    int seat; // 좌석 수
    public String name; // 차 이름
    int area; // 지역
    int seatCount; // 승객 수
    int totalC; // 이동 횟수
    int totalD; // 총 이동 거리
    int cost; // 비용
    int refill; // 주유횟수
    boolean isExtra; // 부가기능

    String time;
    Car (String name) {
        this.name =name;
    }
    public void setArea(int area) {
        switch (area) {
            case 1: this.area = 400; break;
            case 2: this.area = 200; break;
            case 3: this.area = 150; break;
            case 4: this.area = 300; break;
        }
    }
    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public void setTotalC() {
        totalC = seatCount / seat;
        if (seatCount % seat > 0) totalC += 1;
    }
    public void setTotalD() {
        totalD = totalC * area;
    }
    public void setRefill() {
        //a = (총거리 / 연비)
        int a = totalD % fuelE;
        if (a > 0) a = (totalD / fuelE)+1;
        else a = totalD/ fuelE;

        if(a % fuelTank > 0) {
            refill = (a / fuelTank) + 1;
        }else refill = a / fuelTank;
    }
    public void setCost() {
        cost = (totalD / fuelE) * 2000;
        if(totalD % fuelE > 0) cost += 2000;
    }
    public void setTime() {
        int hour = totalD / speed;
        int left = totalD - (speed * hour);
        double leftMin = ((double) left / speed) * 100 + 1;
        int min =  (int)((leftMin * 60) / 100);
        time = hour + "시 " + min + "분";
    }

    public void getInfo () {
        System.out.println("=".repeat(6)+" " + name + " " + "=".repeat(6));
        System.out.println("총 비용 : " + cost + "원");
        System.out.println("총 주유 횟수 : " + refill + "회");
        System.out.println("총 이동 시간 : " + time);
    }

}
class SportsCar extends Car {
    SportsCar(String name) {
        super(name);
        this.speed = 250;
        this.fuelE = 8;
        this.fuelTank = 30;
        this.seat =2;
    }
    public void isExtra(boolean isExtra) {
        this.isExtra = isExtra;
        if(isExtra) speed = (speed *120) / 100;
    }
}
class Sedan extends Car {
    Sedan(String name) {
        super(name);
        this.speed = 200;
        this.fuelE = 12;
        this.fuelTank = 45;
        this.seat = 4;
    }
    public void isExtra(boolean isExtra) {
        this.isExtra = isExtra;
        if(isExtra) seat += 1;
    }
}
class Bus extends Car {
    Bus(String name) {
        super(name);
        this.speed = 150;
        this.fuelE = 5;
        this.fuelTank = 100;
        this.seat = 20;
    }
    public void isExtra(boolean isExtra) {
        this.isExtra = isExtra;
        if(isExtra) this.fuelTank += 30;
    }
}
