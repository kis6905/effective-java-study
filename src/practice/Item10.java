package practice;

import java.util.HashMap;
import java.util.Map;

public class Item10 {

	public static void main(String[] args) {
		Map<Person, Object> map = new HashMap<>();
		map.put(new Person("leaf", 33), 1);
		map.put(new Person("leaf", 33), 2);
		
		Map<Foo, Object> map2 = new HashMap<>();
		map2.put(new Foo("leaf", 33), 1);
		map2.put(new Foo("leaf", 33), 2);
		
		System.out.println(map.keySet().size());
		System.out.println(map2.keySet().size());
		
		System.out.println(map.containsKey(new Person("leaf", 33)));
		
	}
	

	static class Foo {
		private String name;
		private Integer age;
		
		public Foo() {}
		
		public Foo(String name, Integer age) {
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
			return "Foo [name=" + name + ", age=" + age + "]";
		}
	}
	
	static class Person {
		private String name;
		private Integer age;
	
		public Person() {}
		
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
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((age == null) ? 0 : age.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
	
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (age == null) {
				if (other.age != null)
					return false;
			} else if (!age.equals(other.age))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
	}

}
