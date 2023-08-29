package 스트링다루기;
// StringBuffer(synchronize(동기화)지원), StringBuilder(지원 하지 않음) 둘 다 문자열을 추가하거나 변경할 때 사용
// StringBuffer => 멀티쓰레드 환경에서 안전 (lock/unlock) / StringBuilder => 값이 깨질 수 있음
// String 자료형과 어떤 차이가 있는지만 이해하면 됨
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // 같은 영역에서 계속 추가 // 공공API 활용할 때 유리
        sb.append("hello");
        sb.append(" ");
        sb.append("java");
        System.out.println(sb);


        // 더할 때마다 새로 만들어짐 // 짧은 경우에는 String 유리
        String st = ""; // null / Wrapper클래스가 autoCasting을 해줌
        st += "hello";
        st += " ";
        st += "java";
        System.out.println(st);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("jump to java");
        // insert : 해당 offset에 문자열을 추가
        sb2.insert(1,"hello");
        System.out.println(sb2);
        sb2.delete(7, 10);
        System.out.println(sb2);
        System.out.println(sb2.substring(0,4));
        
    }
    
}
