package 파이널실습2_커피메뉴읽기;

import 파이널실습2_커피메뉴만들기2.MenuInfo2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

public class CoffeeMenuListInput {
    public static void main(String[] args) {
        Map<String,MenuInfo2> map = readMenu();
        System.out.println("=".repeat(10) + "메뉴보기" + "=".repeat(10));
        for(String e : map.keySet()) {
            System.out.println("메뉴 : " + map.get(e).getName());
            System.out.println("가격 : " + map.get(e).getPrice());
            System.out.println("분류 : " + map.get(e).getCategory());
            System.out.println("설명 : " + map.get(e).getDescription());
            System.out.println("-".repeat(28));
        }
    }
    public static Map<String, MenuInfo2> readMenu() {
        try {
            FileInputStream fis = new FileInputStream("d:/tmp/MenuList.db");
            //FileInputStream fis = new FileInputStream("c:/tmp/MenuList.db"); // 노트북
            ObjectInputStream ois = new ObjectInputStream(fis);
            Map<String,MenuInfo2> map = (Map<String,MenuInfo2>) ois.readObject();
            return map;
        }catch (IOException e){
        }catch (ClassNotFoundException e) {}
        return null;
    }
}
