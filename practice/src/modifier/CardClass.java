package modifier;

public class CardClass {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	CardClass(String kind, int number){
		this.KIND = kind;
		this.NUMBER = number;
	}
	
	CardClass() {
		this("heart", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}
