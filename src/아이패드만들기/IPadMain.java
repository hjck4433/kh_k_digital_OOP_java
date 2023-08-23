package 아이패드만들기;

public class IPadMain {
    public static void main(String[] args) throws InterruptedException { //Interrupt... main에서 받아서 콘솔로 보냄
        while(true) {
            IPadPro iPadPro = new IPadPro("iPad Pro");
            if(!iPadPro.continueOrder()) break;
            iPadPro.setScreen();
            iPadPro.setColor();
            iPadPro.setMemory();
            iPadPro.setNetwork();
            iPadPro.setName();
            iPadPro.setSerialNum();
            iPadPro.progressPad2();
            iPadPro.productPad();
        }
    }
}
