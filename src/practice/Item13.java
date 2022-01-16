package practice;

public class Item13 {

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.toString());

	}
	
	static class Person {
		private String name;
		private Integer age;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
	}

}
