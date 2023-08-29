package 박싱과언박싱;

public class BoxingMain {
    public static void main(String[] args) {
        Integer num = 12; // 오토 박싱 Integer num = new Integer(12);
//        Integer num = new Integer(12);
//        System.out.println(num);

        String st = new String(); // String st = "";

        Character ch = 'x'; // 오토 박싱
        char c = ch; // 오토 언박싱 char c = ch.charValue();
        System.out.println(c);
    }
}
