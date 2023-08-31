package 학생성적정렬하기;

public class Student implements Comparable<Student> {
    String name;
    int score;
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if(this.score < o.score) return 1;
        else if(this.score == o.score) {
            return this.name.compareTo(o.name);
        }else return -1;
    }
}
