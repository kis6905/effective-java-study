package practice;

import java.util.ArrayList;
import java.util.List;

public class Item14 {

	public static void main(String[] args) {
		Person person1 = new Person("leaf", 33);
		Person person2 = new Person("hong", 29);
		
		List<Person> list = new ArrayList<>();
		list.add(person1);
		list.add(person2);
		
		list.stream().forEach(System.out::println);
		
		list.sort(Person::compareTo);
		list.sort((o1, o2) -> o1.getAge().compareTo(o2.getAge()));
		
		list.stream().forEach(System.out::println);
	}
	
	static class Person implements Comparable<Person> {
		private String name;
		private Integer age;
		
		public Person(String name, Integer age) {
			super();
			this.name = name;
			this.age = age;
		}
		
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
		@Override
		public int compareTo(Person o) {
			System.out.println("compareTo");
			return this.age.compareTo(o.getAge());
		}
	}

}
