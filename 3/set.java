import java.util.*;

public class set {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(10,2);
		for (int i=0;i<4;i++){
			v.add((int)(Math.random()*10));
		}
		System.out.println("�������ϳ�ʼ��Ϊ��");
		printset(v);
		System.out.println();
		int operation=0;
		while(operation!=-1){
			System.out.println();
			System.out.println("1:����  2:ɾ��   3: �޸�   4:����");
			System.out.println();
			System.out.printf("������");
			Scanner sc =new Scanner(System.in);
			operation=sc.nextInt();
			if(operation==1){
				System.out.printf("���ӵ�Ԫ�أ�");
				v.add(sc.nextInt());
			}
			else if(operation==2){
				System.out.printf("ɾ���ڼ���Ԫ�أ�");
				v.remove(sc.nextInt());
			}
			else if(operation==3){
				System.out.printf("�޸ĵڼ���Ԫ�أ�");
				int i=sc.nextInt();
				System.out.printf("�޸ĳɣ�");
				v.setElementAt(sc.nextInt(),i);
			}
			else if(operation==4){
				System.out.printf("���ҵ�Ԫ�أ�");
				int i =v.indexOf(sc.nextInt());
				if(i!=-1)
					System.out.println("�±�Ϊ"+i);
				else 
					System.out.println("û������ҵ�Ԫ��");
			}
			else {
				operation=-1;
				System.out.println("error");
				return;
			}
			System.out.println("���ڵ���������Ϊ��");
			printset(v);
		}
	}
	public static void printset(Vector<Integer> v){
		for(int i = 0;i < v.size();i++){
			System.out.print(i+": "+v.get(i)+", ");
		}
	}
}
