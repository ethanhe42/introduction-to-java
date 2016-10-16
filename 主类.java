package a;

import java.util.Scanner;

public class 主类 {
	public static void main(String[] args )
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			System.out.print("请输入半径"+i+"： ");
			圆类 圆 = new 圆类(sc.nextDouble());
			System.out.printf("圆"+i+"的面积是：%10.2f\r\n", 圆.面积());
		}
	}

}
