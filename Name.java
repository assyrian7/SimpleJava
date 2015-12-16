public class Name{

	private String name;

	private int age;

	public Name(String name, int age){

		this.name = name;
		this.age = age;
	}

	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String toString(){
		return "My name is " + name + " and my age is " + age + ".";
	}



}