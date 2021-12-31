package isp.bad;

public class DivMediaPlayer implements IMediaPlayer {
    @Override
    public void playAudio() {
        System.out.println("div play audio");
    }

    @Override
    public void playVideo() {
        System.out.println("div play video");
    }
}
