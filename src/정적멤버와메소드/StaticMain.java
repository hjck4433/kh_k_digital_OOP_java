package 정적멤버와메소드;

public class StaticMain {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinhan = new Bank("신한", 1000);
        Bank nh = new Bank("농협", 0);
        kakao.setDeposit(2300);
        kakao.setWithDraw(1850);
        kakao.viewAccount();
        shinhan.setWithDraw(2000);
        shinhan.viewAccount();
        System.out.println(Bank.getCount()); // 클래스에 대한 메소드 접근
    }
}
