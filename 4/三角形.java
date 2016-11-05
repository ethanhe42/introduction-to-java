package shape;

public class 三角形 extends 积木块 {
	int 边 = 3;
	int a = 0, b = 0, c = 0;
	三角形() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
		this.边 = 3;
	}
	三角形(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public void 面积() {
		// TODO Auto-generated method stub
		int p = (a + b + c) / 3;
		System.out.println("面积为" + Math.sqrt((p - a) * (p - b) * (p - c)));
	}
}