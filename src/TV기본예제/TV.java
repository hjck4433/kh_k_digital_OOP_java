package TV기본예제;

public class TV {
    private boolean isON; // TV 전원
    private int channel;  // 채널
    private int volume;   // 볼륨

    // 초기화값
    TV() {
        isON = false;
        channel = 11;
        volume = 10;
        System.out.println("전원 : " + isON+ ", 채널 : " + channel + ", 볼륨 : " + volume);
    }
    TV(boolean isON, int ch, int vol) { // 초기화값
        this.isON = isON;
        channel = ch;
        volume = vol;
        System.out.println("전원 : " + isON+ ", 채널 : " + channel + ", 볼륨 : " + volume);
    }

    // 직접 작동
    public void setON(boolean isON) {
        this.isON = isON;
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("TV 전원이 " + onOffStr + "되었 습니다.");
    }
    public void setChannel(int ch) { // 메소드에 접근할 때 범위 제한 => 채널 허용 범위 설정
        if (ch >= 1 && ch <= 999) {
            channel = ch;
            System.out.println("채널을 " + ch + "로 변경하였습니다.");
        } else {
            System.out.println("채널 설정값이 허용범위를 벗어 났습니다.");
        }
    }
    public void setVolume(int vol) {
        if (vol >= 0 && vol <= 100) {
            volume = vol;
            System.out.println("볼륨을 " + vol + "로 변경하였습니다.");
        } else {
            System.out.println("볼륨 설정값이 허용범위를 벗어 났습니다.");
        }
    }
    public void getInfoTV() {
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("=".repeat(5) + "TV 정보" + "=".repeat(5));
        System.out.println("전원 : " + onOffStr);
        System.out.println("볼륨 : " + volume);
        System.out.println("채널 : " + channel);

    }

}
