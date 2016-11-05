import java.io.*;
import java.util.*;

public class score {
	public static void main(String args[]) {
		FileReader fin = null;
		double sum = 0;
		try {
			fin = new FileReader("D://javaworkspace1//HelloWorld//src//a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(fin);
		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				sc.nextInt();
				continue;
			}
			if (sc.hasNextDouble()) {
				sum += sc.nextDouble();
				continue;
			} 
			sc.next();
		}
		System.out.println(sum);
	}
}
