package shape;

public class ������ extends ��ľ�� {
	int �� = 3;
	int a = 0, b = 0, c = 0;
	������() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
		this.�� = 3;
	}
	������(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public void ���() {
		// TODO Auto-generated method stub
		int p = (a + b + c) / 3;
		System.out.println("���Ϊ" + Math.sqrt((p - a) * (p - b) * (p - c)));
	}
}