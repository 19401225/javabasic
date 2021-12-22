package oopExam;


class Tv {
    boolean power;    // 전원
    int channel;      // 채널
    
    void power() {}         // 전원 기능
    void channelUp() {}     // 채널 올림 기능
    void channelDown() {}   // 채널 내림 기능
}

class CaptionTv extends Tv {   // Tv클래스의 기능이 모두 ChildTv 클래스로 오게 된다.
    boolean caption;     // 캡션
    void caption() {}    // 캡션 기능
}


public class CaptionTvExam {
    public static void main(String[] args) {
        CaptionTv tv = new CaptionTv();     // tv객체 생성
        tv.power();         // 부모 매서드
        tv.channel = 11;    // 부모 변수
        tv.channelUp();     // 부모 매서드
        System.out.println(tv.channel); // 12
        tv.caption = true;
        tv.caption();
        System.out.println(tv.caption);  // true

    
    }
}
