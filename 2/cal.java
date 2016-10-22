import java.util.Scanner;

public class cal {
	public static void main(String args[]) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("«Î ‰»Î“ª∏ˆn£∫");
		n = sc.nextInt();
		double sum = 0;
		for (int j = 1; j <= n; j++) {
			sum += Math.pow(3.0, j) * factorial(j) / (Math.pow(j, j));
		}
		System.out.println("3*1!/1+3^2*2!/2^2+3^3*3!/3^3+...+3^n*n!/n^n="
				+ sum);
	}
	public static int factorial(int a) {
		if (a <= 1) {
			return 1;
		} else {
			return factorial(a - 1) * a;
		}
	}
}