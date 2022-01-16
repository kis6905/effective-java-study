package practice;

public class Item24 {

	private static int a = 5;
	private int b = 10;
	
	public static void main(String[] args) {
		StaticMemberClass smc = new StaticMemberClass();
		smc.print();
		
		Item24 item = new Item24();
		MemberClass mc = item.new MemberClass();
		mc.print();
		
		item.setB(20);
		mc.print();
	}
	
	// 정적 멤버 클래스
	static class StaticMemberClass {
		void print() {
			System.out.println("StaticMemberClass, " + a);
//			System.out.println("StaticMemberClass, " + b); // 접근 불가
		}
	}
	
	// 비정적 멤버 클래스
	class MemberClass {
		void print() {
			System.out.println("MemberClass, " + a);
			System.out.println("MemberClass, " + b);
		}
	}
	
	public void setB(int b) {
		this.b = b;
	}
}

