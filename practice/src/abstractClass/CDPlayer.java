package abstractClass;

public class CDPlayer extends Player{

	@Override
	void play(int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	
	//CDPlayer클래스에 추가로 정의된 멤버
	int currentTrack;
	
	void nextTrack() {
		currentTrack++;
	}

	void preTrack() {
		if(currentTrack > 1) {
			currentTrack--;
		}
	}
}
