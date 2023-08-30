package 제네릭연습1;
// multi type parameter
public class GenericEx1 {
    public static void main(String[] args) {
//        Person<String> p1 = new Person<>("안유진");
//        System.out.println(p1.info);
//        Person<Integer> p2 = new Person<>(21);
//        System.out.println(p2.info);
        Product<String, Integer> pr1 = new Product<>();
        pr1.setName("스마트 TV");
        pr1.setYear(2023);
        System.out.println(pr1.getName() + " " + pr1.getYear());

        Product<Integer, String> pr2 = new Product<>();
        pr2.setName(12345678);
        pr2.setYear("2023");
        System.out.println(pr2.getName() + " " + pr2.getYear());

    }
}

class Product<T, M> {
    private T name;
    private M year;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getYear() {
        return year;
    }

    public void setYear(M year) {
        this.year = year;
    }
}

class Person <T>{
    public T info;
    Person(T info) {
        this.info = info;
    }
}