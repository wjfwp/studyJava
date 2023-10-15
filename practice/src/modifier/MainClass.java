package modifier;

public class MainClass {

	public static void main(String[] args) {
		
		CardClass card = new CardClass();
		System.out.println(card);
		
		CardClass card2 = new CardClass("dia", 2);
		System.out.println(card2.KIND);
		
		
		TimeClass time = new TimeClass();
		
		time.setHour(199);
		
		int a = time.getHour();
		System.out.println(a);
		
		TimeClass2 t = new TimeClass2(12, 30, 35);
		System.out.println(t);
		
		t.setHour(t.getHour() + 4);
		System.out.println(t);
		
	}
}
