package practice;

public class Item63 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("A").append("B");
		String result = sb.toString();
		System.out.println(result);
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("A").append("B");
		String result2 = sbf.toString();
		System.out.println(result2);
	}
	
}
