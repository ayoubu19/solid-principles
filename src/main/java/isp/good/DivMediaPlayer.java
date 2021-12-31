package isp.good;

import isp.bad.IMediaPlayer;

public class DivMediaPlayer implements IAudioPlayer , IVideoPlayer {
    @Override
    public void playAudio() {
        System.out.println("div play audio");
    }

    @Override
    public void playVideo() {
        System.out.println("div play video");
    }
}
