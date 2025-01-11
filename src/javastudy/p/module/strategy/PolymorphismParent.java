package javastudy.p.module.strategy;

public class PolymorphismParent {

    public void powerOn_Off() {
        System.out.println("전원 ON/OFF 기능");
    } // 전원 켜기/끄기

    public void volumeOn_Off() {
        System.out.println("볼륨 ON/OFF 기능");
    } // 볼륨 켜기/끄기

    public void channelOn_Off() {
        System.out.println("채널 ON/OFF 기능");
    } // 채널 돌리기

}

// 