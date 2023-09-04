package 함수형_매개변수람다식;

@FunctionalInterface // 함수형 프로그램을 만들기 위한 어노테이션, 내부에 함수가 한개만 존재
interface MyFuncInterface { // 메소드가 독립적으로 존재할 수 없기때문에 인터페이스로 감싸는 것
    void method(int x);
}

@FunctionalInterface // 리턴값이 있는 람다식
interface MyFuncInterface2 {
    int min(int x, int y);
}


public class LambdaEx {
    public static void main(String[] args) {
        MyFuncInterface fi = x -> { // 매개변수가 한 줄인 경우는 () 생략 가능
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(10);

        MyFuncInterface2 fi2 = (x, y) -> x < y ? x : y; // 구현부가 한줄인 경우 {} 생략 가능, return 생략 / Math::min;
        System.out.println(fi2.min(3,4));
    }
}
