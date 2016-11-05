import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class t {
	public static void main(String args[]) {
		Thread1 t1 = new Thread1();
		t1.start();
		Thread2 t2 = new Thread2();
		t2.start();

	}

}

class Thread1 extends Thread {

	public void run() {
		String text = "D://javaworkspace1//HelloWorld//src//a.txt";
		Scanner in = null;
		try {
			in = new Scanner(new File(text));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int sum = 0;

		while (in.hasNextInt()) {
			sum +=in.nextInt();
		}
		System.out.println(text+" sum " + sum);
	}

}

class Thread2 extends Thread {

	public void run() {
		String text = "D://javaworkspace1//HelloWorld//src//b.txt";
		Scanner in = null;
		try {
			in = new Scanner(new File(text));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int sum = 0;

		while (in.hasNextInt()) {
			sum +=in.nextInt();
		}
		System.out.println(text+" sum " + sum);
	}

}
