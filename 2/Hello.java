public class Hello {
	public static void main(String args[]) {
		String a="7��11��13�ı����� ";
		String b="7��11����7��13��11��13�ı��� ";
		String c="7��11��13���� "; 
		for (int i = 7; i <= 5000; i++) {
			if (i % 7 == 0 || i % 11 == 0 || i % 13 == 0) {
				a+= i + ",";
			}
			if (i % (7*11) == 0 || i % (7*13) == 0 || i % (11*13) == 0) {
				b+= i + ",";
			}
			if (i % (7*11*13) == 0) {
				c+= i + ",";
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}