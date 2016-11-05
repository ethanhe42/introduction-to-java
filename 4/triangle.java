import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
public class triangle {
	public static void main(String args[]) {
		PrintStream ps = null;
		try {
			ps = new PrintStream("D://javaworkspace1//HelloWorld//src//c.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("«Î ‰»Î–– ˝£∫");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int col = row;
		
		int[][]	 array = new int[row][col];
		
		for(int i = 1; i < row; i++){
			for(int j = row; j > i; j--){
				ps.print("  ");
			}
			for(int j = 1; j <= i; j++){
				if(i == j || j == 0){
					array[i][j] = 1;
				}else{
					array[i][j] = array[i-1][j-1] + array[i-1][j];
				}
				ps.print(array[i][j] + "   ");
			}
			ps.println();
		}

	}

}
