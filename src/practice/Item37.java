package practice;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class Item37 {

	public static void main(String[] args) {
		EnumSet.of(LifeCycle.ANNUAL);
		EnumSet.of(LifeCycle.ANNUAL, LifeCycle.PERENNIAL);
		
		// enum 의 개수만큼 size를 잡음
		Map<LifeCycle, Set<Plant>> map = new EnumMap<>(LifeCycle.class);
		
		map.put(LifeCycle.ANNUAL, Set.of(new Plant("test", LifeCycle.ANNUAL)));
		
	}
}

class Plant {
	private String name;
	private LifeCycle lifeCycle;
	
	public Plant(String name, LifeCycle lifeCycle) {
		this.name = name;
		this.lifeCycle = lifeCycle;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

enum LifeCycle {
	ANNUAL, PERENNIAL, BIENNIAL
}
