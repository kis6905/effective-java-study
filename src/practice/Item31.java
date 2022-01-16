package practice;

import java.util.HashSet;
import java.util.Set;

public class Item31 {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		s1.add("1");
		s1.add("2");
		
		Set<String> s2 = new HashSet<>();
		s2.add("2");
		s2.add("3");
		
		Set<String> result = union(s1, s2);
		System.out.println(result.toString());
		
		Set<Developer> set1 = new HashSet<>();
		test(set1);
		
		testCopy(new HashSet<Person>());
	}
	
	static void test(Set<? extends Person> s1) {
		System.out.println(s1.toString());
	}
	
	static void testCopy(Set<? super Person> dst) {
		Set<Developer> set1 = new HashSet<>();
		dst.addAll(set1);
		
		Set<Person> set2 = new HashSet<>();
		dst.addAll(set2);
	}
	
	static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
		Set<E> result = new HashSet<>();
		result.addAll(s1);
		result.addAll(s2);
		return result;
	}

}

class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Developer extends Person {
	private String skill;
	
	public Developer(String name, String skill) {
		super(name);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
}
