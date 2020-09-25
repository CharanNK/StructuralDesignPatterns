package adapter.mediaPlayers;

public class MediaAdapter implements MediaPlayer{

	AdvanceMediaPlayer advanceMediaplayer;
	
	public MediaAdapter(String audioType) {
		
		if(audioType.equalsIgnoreCase("vlc")) {
			advanceMediaplayer = new VlcPlayer();
		}else if(audioType.equalsIgnoreCase("mp4")) {
			advanceMediaplayer = new Mp4Players();
		}
	}
	
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advanceMediaplayer.playVlc(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")) {
			advanceMediaplayer.playMp4(fileName);
		}
	}

}
