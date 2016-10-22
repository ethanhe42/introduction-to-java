import java.util.Scanner;

public class beautyprint {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int n = sc.nextInt();
		int former = n/2;
		for (int i=0;i<former;i++){
			String s="";
			s+=repeat(" ", (former-i-1)*2)+repeat(" "+(i+1), 2*i+1);
			System.out.println(s);
		}
		int last = n-former;
		for (int i=0;i<last;i++){
			String s="";
			s+=repeat("  ", i) + repeat((former+i+1)+" ", 2*(last-i));
			System.out.println(s);
		}
	}
	public static String repeat(String a, int n){
		String ret = "";
		for(int i=0;i<n;i++){
			ret+=a;
		}
		return ret;
	}
}