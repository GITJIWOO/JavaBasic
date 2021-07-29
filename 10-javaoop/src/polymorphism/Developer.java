package polymorphism;

public class Developer extends Person {

	private String language;
	
	public Developer(String name, 
					int age, 
					String language) {
		
		super(name, age);
		this.language = language;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("개발언어 : " + language);
		System.out.println("--------------------");
	}
	



	
}
