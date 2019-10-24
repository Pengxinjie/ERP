package ·â×°;

public class Person {
	private String name;
	private String sex;
	private String age;
	
	public Person() {
		this.name="Tom";
	}
	
	public String getName() {
		if(Math.random()<0.1) {
			return this.name;			
		}
		else {
			return "Äã²Â";
		}
	}

}
