package practice;

public class Item56 {

	public static void main(String[] args) {
	}
	
	/**
	 * 그냥 텍스트입니다.
	 * <p>
	 * {@code getName(); }
	 * </p>
	 * 
	 * <pre>
	 * 여기안에서는 여러줄 가능
	 * 과연?
	 * </pre>
	 * 
	 * {@literal r < 1} 이면 그렇다
	 * 
	 * {@summary 이 메소드는 그저 그런 메소드이다. 이 태그를 첫줄에 선언하면 doc이 깨진다... 버근가?}
	 * @implSpec 이 메소드를 오버라이드 하려면 잘 하세요.
	 * @param name 이름임
	 * @return
	 */
	public static String getName(String name) {
		return "leaf";
	}

}
