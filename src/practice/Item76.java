package practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Item76 {

	public static void main(String[] args) {
		Developer developer = new Developer();
		try {
			developer.addSkills(Arrays.asList("JAVA", "PYTHON"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(developer.toString());
		}
	}
	
}

enum Skill {
	JAVA,
	JAVASCRIPT,
	KOTLIN
}

class Developer {
	private Set<Skill> skills = new HashSet<>();
	
	public void addSkills(Collection<String> skills) {
		for (String skillName : skills) {
			Skill skill = Skill.valueOf(skillName);
			this.skills.add(skill);
		}
	}
	
	public String toString() {
		return skills.stream()
				.map(s -> s.name())
				.collect(Collectors.joining(","));
	}
	
}
