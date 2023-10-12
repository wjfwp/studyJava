package abstractClass;

public class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("marine 위치 이동합니다. x: " + x + ", y: " + y);
		
	}

	void stimPack() {
		System.out.println("스팀팩을 사용합니다");
	}
}
