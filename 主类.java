package a;

import java.util.Scanner;

public class ���� {
	public static void main(String[] args )
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			System.out.print("������뾶"+i+"�� ");
			Բ�� Բ = new Բ��(sc.nextDouble());
			System.out.printf("Բ"+i+"������ǣ�%10.2f\r\n", Բ.���());
		}
	}

}
