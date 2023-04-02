package practice;

import java.util.HashSet;
import java.util.Set;

public class Item26 {

	public static void main(String[] args) {
		Set rawType = new HashSet<>();
		rawType.add(1);
		rawType.add("1");
		
		Set<?> set = new HashSet<>();
		set.add(null);
//		set.add("1"); // null 말곤 넣을수 없다.
		
		
		test(new HashSet<Object>());
//		test(new HashSet<String>()); // 이건 불가능
	}
	
	public static int test(Set<Object> s) {
		return 0;
	}

}
