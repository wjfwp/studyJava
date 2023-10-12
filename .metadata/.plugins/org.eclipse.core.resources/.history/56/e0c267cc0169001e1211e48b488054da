package abstractClass;

public class MainClass {
	
	public static void main(String[] args) {
		
		Tank tank = new Tank();
		tank.changeMode();
		tank.stop();
		
		Marine m = new Marine();
		m.stimPack();
		
		Unit[] group = new Unit[4];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Dropship();
		group[3] = new Marine();
		
		for(int i = 0; i < group.length; i++) {
			group[i].move(100, i);
		}
	}
	
	
	

}
