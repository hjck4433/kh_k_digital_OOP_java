package 디폴트메소드_익명객체;

public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다");
    }

    @Override
    public void turnOFF() {
        System.out.println("Audio를 끕니다");
    }

    @Override
    public void setVolume(int vol) {
        if(vol > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (vol < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = vol;
        }
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }

    void getInfo() {
        System.out.println("오디오 입니다.");
        System.out.println("현재 Audio 볼륨은 " + volume + "입니다.");
    }

    @Override
    public void setMute(boolean mute) {
        if(mute) {
            System.out.println("오디오를 무음 처리합니다.");
        }else System.out.println("오디오 무음 처리를 해제합니다.");
    }
}
