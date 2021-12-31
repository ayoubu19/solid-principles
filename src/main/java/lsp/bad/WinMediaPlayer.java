package lsp.bad;

import lsp.bad.excepations.VideoNonSupportedException;

public class WinMediaPlayer extends MediaPlayer{

    // Play video is not supported in Winamp player
    public void playVideo() {
        throw new VideoNonSupportedException();
    }
}
