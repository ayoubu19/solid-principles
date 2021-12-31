package lsp.good;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // Created list of players
        List <IMediaPlayer> allPlayers = new ArrayList<>();
        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new DivMediaPlayer());

        // Play video in all players
        playVideoInAllMediaPlayers(allPlayers);

        // Well - all works as of now...... :-)
        System.out.println("---------------------------");

        // Now adding new Winamp player
        allPlayers.add(new WinMediaPlayer());


        playVideoInAllMediaPlayers(allPlayers);
    }

    
    public static void playVideoInAllMediaPlayers(List<IMediaPlayer> allPlayers) {

        for (IMediaPlayer player: allPlayers) {
            player.playMedia();
        }
    }
}

