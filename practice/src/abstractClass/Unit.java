package abstractClass;

public abstract class Unit {
	int x, y;
	
	abstract void move(int x, int y);
	void stop() {
		System.out.println("현재위치에 정지합니다.");
	}

}
