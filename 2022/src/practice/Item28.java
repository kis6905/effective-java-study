package practice;

/**
 * 배열보다는 리스트를 사용하라
 */
public class Item28 { 
	
	public static void main(String[] args) {
		Object[] objArr = new Long[1]; // Array는 공변성
		objArr[0] = "1";
		
		// 리스트를 사용할때 타입이 다를경우 아예 컴파일 자체가 안됨
//		List<Object> list = new ArrayList<Long>(); // 제네릭은 불공변성
//		list.add("1");
	}
	
}
