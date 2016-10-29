import java.util.*;
	public class Hello{
		public static void main(String[] args){
		int bound = 10;
		int[] a=new int[50];
		for(int i=0;i<a.length;i++){
			a[i] = (int)(Math.random()*bound);
		}
		System.out.println("array:");
		System.out.println(Arrays.toString(a));
		Scanner sc =new Scanner(System.in);
		System.out.printf("请输入在数组中所要查找的数, 范围(0~"+(bound-1)+"):");
		int x=sc.nextInt();
		int cnt=0;		
		for(int j=0;j<a.length;j++){
			if(a[j]==x){
				System.out.printf("%d ",j);
				cnt++;
			}
		}
		if(cnt==0) System.out.println("没有"+x);
		else System.out.printf("有%d个%d。",cnt,x);
 	}
 }
