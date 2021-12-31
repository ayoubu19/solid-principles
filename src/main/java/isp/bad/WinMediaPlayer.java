package isp.bad;

public class WinMediaPlayer implements IMediaPlayer {


    @Override
    public void playAudio() {
        System.out.println("div play audio");
    }

    @Override
    public void playVideo() {
        System.out.println(" i don t need play video");
    }
}
