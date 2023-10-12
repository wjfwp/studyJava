package abstractClass;

public abstract class Player {

	boolean pause;
	int currentPos;
	
	Player() {
		pause = false;
		currentPos = 0;
	}
	
	/** 지정된 위치(pos)에서 재생을 시작하는 기능을 수행하도록 작성 */
	abstract void play(int pos); //추상메서드
	/** 재생을 즉시 멈추는 기능을 수행하도록 작성*/
	abstract void stop(); //추상메서드
	
	void play() {
		play(currentPos);  
	}
	
	void pause() {
		if(pause) {
			pause = false;
			play(currentPos);
		} else {
			pause = true;
			stop();
		}
	}
}
