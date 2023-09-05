package 입출력_파일복사하기;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx {
    public static void main(String[] args) throws IOException {
        String originFileName = "src/입출력_파일복사하기/햄스터이미지.jpg";
        String targetFileName = "d:/tmp/hamster.jpg";
        //String targetFileName = "c:/tmp/hamster.jpg"; // 노트북

        FileInputStream fis = new FileInputStream(originFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo;
        byte[] readBytes = new byte[100];
        while ((readByteNo = fis.read(readBytes))!= -1) {
            fos.write(readBytes, 0, readByteNo);
        }
        fos.flush();
        fos.close();
        fis.close();
    }
}
