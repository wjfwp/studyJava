package day10.final_.basic;

public class Person {

	public final String nation = "korea";
	public final String ssn;
	public String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
