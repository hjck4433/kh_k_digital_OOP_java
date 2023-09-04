package 예외처리두번째;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Checked Exception : 컴파일러가 컴파일 타임에 예외 상황을 체크 함.
public class ExceptionEx2 {
    public static void main(String[] args) /*throws IOException*/ {
        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            br.readLine();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("파일이 없습니다. 다시 첨부해주세요.");
        }
    }
}
