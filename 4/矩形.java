package shape;

public class ���� extends ��ľ�� {
	int �� = 4;
	int a = 0, b = 0;

	����() {
		this.a = 0;
		this.b = 0;
		this.�� = 3;
	}

	����(int a, int b) {
		this.a = a;
		this.b = b;

	}

	@Override
	public void ���() {
		// TODO Auto-generated method stub

		System.out.println("���Ϊ" + a * b);
	}
	
	public static void main(String args[])
	{
		������ triangle=new ������(3,4,5);
		Բ cirle=new Բ(5);
		���� square=new ����(3,4);
		triangle.���();
		cirle.���();
		square.���();
	}
}
