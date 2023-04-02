package practice;

import java.util.Optional;

public class Item55 {

	public static void main(String[] args) {
		Optional<String> nameOptaion1 = getFormattedName("leaf");
//		Optional<String> nameOptaion1 = getFormattedName("");
		String nameStr1 = nameOptaion1.map(name -> name + ", 안녕하세요.").orElse("이름없음");
		System.out.println(nameStr1);
	}
	
	public static Optional<String> getFormattedName(String name) {
		if (name == null || name.isEmpty()) {
			return Optional.empty();
		} else {
			return Optional.of(name + "님");
		}
	}

}
