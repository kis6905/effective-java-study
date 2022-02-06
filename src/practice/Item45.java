package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Item45 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("name", "leaf");
		String name = map.computeIfAbsent("name", (unused) -> "unknown");
		String age= map.computeIfAbsent("age", (unused) -> "unknown");
		System.out.println("name: " + name + ", age: " + age);
		
		Map<Integer, Long> grouppedMap = Stream.of(1, 2, 3, 4, 5, 1, 1, 2)
			.collect(Collectors.groupingBy(value -> value, Collectors.counting()));
		
		grouppedMap.keySet().stream()
			.forEach(key -> System.out.println(key + ": " + grouppedMap.get(key)));
		
		List<Person> people = Arrays.asList(new Person("leaf", 34), new Person("GaYeong", 31), new Person("hong", 25));
		
		Map<String, Set<Person>> grouppedByAgeSet = people.stream()
			.collect(Collectors.groupingBy( (Person person) -> {
				String.valueOf(person.getAge()).substring(0, 1);
				return String.valueOf(person.getAge()).substring(0, 1) + "0";
			}, Collectors.toSet()));
		
		grouppedByAgeSet.keySet().stream()
			.forEach(key -> System.out.println(key + ": " + grouppedByAgeSet.get(key)));
	}
	
	private static class Person {
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
	}
}
