package 파이널실습1_텍스트파일읽기_강사님;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

// 임의의 위치에 텍스트 파일을 만들고, 10명의 정보를 공백 기준으로 미리 입력 해둠
// 해당 파일을 읽어 총점을 구하고 총점이 높은 사람 순으로 이름과 총점 보여주기
public class TextReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Student> treeSet = new TreeSet<>();
        FileInputStream fis = new FileInputStream("src/파이널실습1_텍스트파일읽기_강사님/score.txt");
        Scanner sc = new Scanner(fis);
        while(sc.hasNextLine()) {
            // 안유진 99 78 45
            String[] lineSplit = sc.nextLine().split(" ");
            treeSet.add(new Student(lineSplit[0],
                    Integer.parseInt(lineSplit[1])
                            + Integer.parseInt(lineSplit[2])
                            +Integer.parseInt(lineSplit[3])));
        }
        for(Student e : treeSet) {
            System.out.println(e.getName() + " " + e.getTotal());
        }
    }
}
