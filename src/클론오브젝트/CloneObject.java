package 클론오브젝트;

public class CloneObject {
    public static void main(String[] args) {
        Member mem1 = new Member("bear","곰돌이사육사","123456",20,true);
        Member mem2 = mem1.getMember(); //mem1; // 얕은 복사가 일어나는 조건
        mem1.viewInfo();
        mem2.name = "KH정보교육원";
        mem2.password = "KKKKKK";
        mem2.viewInfo();
        mem1.viewInfo();
    }
}
