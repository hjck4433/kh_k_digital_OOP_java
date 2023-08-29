package 클론오브젝트;
// clone()은 데이터보호를 위해 Cloneable 인터페이스를 상속 받은 경우에만 가능
// 깊은 복사를 위해 clone()제공
public class Member implements Cloneable { // 복제를 허용하겠다는 약속 => 선언 하지 않으면 CloneNotSupportedException
    String id;
    String name;
    String password;
    int age;
    boolean adult;
    void viewInfo() {
        System.out.println("ID " + id);
        System.out.println("이름 " + name);
        System.out.println("비밀번호 " + password);
        System.out.println("나이 " + age);
    }

    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }
    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone(); // 클론 메소드 자체는 Object 클래스 타입이므로 형변환
        } catch(CloneNotSupportedException e) {
            e.printStackTrace(); // CloneNotSupportedException 확인을 위함
        }
        return cloned;
    }
}
