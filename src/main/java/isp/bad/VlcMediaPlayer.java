package isp.bad;

public class VlcMediaPlayer implements IMediaPlayer {
    @Override
    public void playAudio() {
        System.out.println("vlc play audio");
    }

    @Override
    public void playVideo() {
        System.out.println("vlc play video");
    }
}
