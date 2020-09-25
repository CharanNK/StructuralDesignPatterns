package adapter.mediaPlayers;

public class MediaAdapterDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer =  new AudioPlayer();
		
		audioPlayer.play("mp3", "music2.mp3");
		audioPlayer.play("mp4", "video1.mp4");
		audioPlayer.play("vlc", "video2.vlc");
		audioPlayer.play("avi", "vidoe3.avi");
	}

}
