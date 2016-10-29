import java.util.*;

public class set {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(10,2);
		for (int i=0;i<4;i++){
			v.add((int)(Math.random()*10));
		}
		System.out.println("整数集合初始化为：");
		printset(v);
		System.out.println();
		int operation=0;
		while(operation!=-1){
			System.out.println();
			System.out.println("1:增加  2:删除   3: 修改   4:查找");
			System.out.println();
			System.out.printf("操作：");
			Scanner sc =new Scanner(System.in);
			operation=sc.nextInt();
			if(operation==1){
				System.out.printf("增加的元素：");
				v.add(sc.nextInt());
			}
			else if(operation==2){
				System.out.printf("删除第几个元素：");
				v.remove(sc.nextInt());
			}
			else if(operation==3){
				System.out.printf("修改第几个元素：");
				int i=sc.nextInt();
				System.out.printf("修改成：");
				v.setElementAt(sc.nextInt(),i);
			}
			else if(operation==4){
				System.out.printf("查找的元素：");
				int i =v.indexOf(sc.nextInt());
				if(i!=-1)
					System.out.println("下标为"+i);
				else 
					System.out.println("没有你查找的元素");
			}
			else {
				operation=-1;
				System.out.println("error");
				return;
			}
			System.out.println("现在的整数集合为：");
			printset(v);
		}
	}
	public static void printset(Vector<Integer> v){
		for(int i = 0;i < v.size();i++){
			System.out.print(i+": "+v.get(i)+", ");
		}
	}
}
