package abstractClass;

public class Tank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("tank 위치 이동합니다. x: " + x + ", y: " + y);
		
	}

	void changeMode() {
		System.out.println("모드를 전환합니다.");
	}

}
