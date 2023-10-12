package abstractClass;

public class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("dropship 위치 이동합니다. x: " + x + ", y: " + y);
		
	}

	
	void load() {
		System.out.println("이륙");
	}
	
	void unload() {
		System.out.println("착륙");
	}

}
