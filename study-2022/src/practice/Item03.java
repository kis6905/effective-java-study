package practice;

public class Item03 {

	public static void main(String[] args) {
		Elvis elvis = Elvis.INSTANCE;
		elvis.getName();
	}
}

enum Elvis {
	INSTANCE;
	
	public String getName() {
		return "";
	}
}


