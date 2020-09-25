package adapter.mediaPlayers;

public class Mp4Players implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file "+fileName);
	}
	
}
