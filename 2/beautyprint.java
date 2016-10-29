import java.util.Scanner;

public class beautyprint {
	public static void main(String args[]) {
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.print("n：");
			int n = sc.nextInt();
			int former = (n+1)/2;
			for (int i=0;i<former;i++){
				String s="";
				s+=repeat(" ", (former-i-1)*2)+repeat(" "+(i+1), 2*i+1);
				System.out.println(s);
			}
			int last = n-(int)((n+1)/2);
			for (int i=0;i<last;i++){
				String s="";
				s+=repeat("  ", i+n%2) + repeat((former+i+1)+" ", 2*(last-i));
				System.out.println(s);
			}
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
