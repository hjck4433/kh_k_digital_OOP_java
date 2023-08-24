package 정적멤버와메소드;
// static => 처음 객체가 만들어질 때 한번 올라감
public class Bank {
    private static int count = 0; // 정적 필드  compile time , 객체로 생성되지 않음
    private int account; // 계좌
    private String bank; // 은행 이름
    Bank(String name, int account) {
        count++;
        this.bank = name;
        this.account = account;
        System.out.println(bank + "은행에 계좌를 개설 합니다. 잔액은 " + this.account + "입니다.");
    }
    public static int getCount() { // 정적 메소드, 객체로 만들어지지 않음
        return count;
    }
    public void setDeposit(final int dep) { // 들어온 값이 변경되는 것을 방지 // ex) 예금되는 금액이 변경되면 안됨
        this.account += dep;
        System.out.println(dep + "을 예금 했습니다.");
    }
    public void setWithDraw(final int with) {
        if(with > account) {
            System.out.println("잔액이 부족 합니다.");
        }else {
            account -= with;
        }
    }
    public void viewAccount() {
        System.out.println("현재 잔액은 : " + account + "입니다.");
    }
    
}
