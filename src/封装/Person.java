package ·â×°;

public class Person {
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	private String sex;
	private String age;
	
	public Person() {
		this.name="Tom";
	}
	
//	public String getName() {
//		if(Math.random()<0.1) {
//			return this.name;			
//		}
//		else {
//			return "Äã²Â";
//		}
}

