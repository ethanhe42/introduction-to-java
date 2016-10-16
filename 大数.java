package 大数;

import java.math.BigInteger;
import java.util.Scanner;
import java.math.*;
public class 大数 {
	public static void main(String arg[])
	{
		BigInteger bigint =new BigInteger("1");
		int m=0,n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("n:");
		String t="1";
		t=Integer.toString(sc.nextInt());
		System.out.println("m:");
		m=sc.nextInt();
		for(int i=1;i<=m;i++)
		{
			bigint=bigint.multiply(new BigInteger(String.valueOf(t)));
		}
		System.out.println(bigint);
	}

}
