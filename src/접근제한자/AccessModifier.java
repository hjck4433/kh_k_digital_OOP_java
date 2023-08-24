package 접근제한자;

import 접근제한자2.Parent;

public class AccessModifier {
    public static void main(String[] args) {
//        Restrictor restrictor = new Restrictor();
//        restrictor.deagu(); // default 메소드에 대한 접근 // 같은 패키지 내에서만 접근 가능
//        restrictor.busan(); // protected 메소드에 대한 접근 // 같은 패키지거나 상속관계에서만 접근 가능
//        restrictor.seoul(); // public 메소드에 대한 접근
        // restrictor.incheon(); 은 private 메소드에 대한 제한 (같은 클래스 내부가 아니기 때문에 접근 허용이 안됨)

        Child child = new Child("엔지니어");
        System.out.println(child.getName());
        //System.out.println(child.getMoney());
        System.out.println(child.getAddr());

    }
}
class Child extends Parent {
    String jobs;
    public Child(String jobs) {
        this.jobs = jobs;
    }
//    public String getMoney() {
//        return money; // Parent에서 private이 되면 접근 제한 됨 // default+다른 패키지 => 같은 패키지 내에서만 가능
//    }
    public String getName() {
        return name;
    }
    public String getAddr() {
        return addr; // protected => 상속관계이면 다른 패키지여도 접근 가능
    }
}