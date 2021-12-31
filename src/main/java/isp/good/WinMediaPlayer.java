package isp.good;

import isp.bad.IMediaPlayer;

public class WinMediaPlayer implements IAudioPlayer {

    @Override
    public void playAudio() {
        System.out.println("div play audio");
    }

}
