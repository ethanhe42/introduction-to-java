package shape;

public class 矩形 extends 积木块 {
	int 边 = 4;
	int a = 0, b = 0;

	矩形() {
		this.a = 0;
		this.b = 0;
		this.边 = 3;
	}

	矩形(int a, int b) {
		this.a = a;
		this.b = b;

	}

	@Override
	public void 面积() {
		// TODO Auto-generated method stub

		System.out.println("面积为" + a * b);
	}
	
	public static void main(String args[])
	{
		三角形 triangle=new 三角形(3,4,5);
		圆 cirle=new 圆(5);
		矩形 square=new 矩形(3,4);
		triangle.面积();
		cirle.面积();
		square.面积();
	}
}
