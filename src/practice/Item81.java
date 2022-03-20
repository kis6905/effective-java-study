package practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Item81 {

	public static void main(String[] args) {
		ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
		map.put("1", "one");
		
		Map<String, String> map2 = Collections.synchronizedMap(new HashMap<>());
		map2.put("2", "two");
		
		String str1 = "leaf";
		String str2 = new String("leaf");
		String str3 = "leaf";
		String str4 = new String("leaf");
		String str5 = str2.intern();
		String str6 = str4.intern();
		
		System.out.println(str1 == str2); // false
		System.out.println(str1 == str3); // true
		System.out.println(str2 == str4); // false
		System.out.println(str5 == str6); // true
		System.out.println(str1 == str5); // true
		System.out.println(str3 == str5); // true
		System.out.println(str2 == str5); // false
	}
	
}
