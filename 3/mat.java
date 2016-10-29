import java.util.*;

public class mat {
	public static void main(String[] args) {
		int a[][][] = { { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } },
				{ { 0, 1, 2 }, { 0, 4, 5 }, { 0, 0, 8 } },
				{ { 0, 0, 0 }, { 3, 4, 0 }, { 6, 7, 8 } },
				{ { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } },
				{ { 1, 0, 0 }, { 0, 2, 0 }, { 0, 0, 1 } }};

		for (int i = 0; i < a.length; i++) {
			System.out.println("test case " + i);
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(Arrays.toString(a[i][j]));
			}
			int[][] arr = a[i];
			boolean duijiao = true, shangsanjiao = true, xiasanjiao = true, danwei = true;
			for (int k = 0; k < arr.length; k++)
				for (int j = 0; j < arr[k].length; j++) {
					if (k != j) {
						if (arr[k][j] != 0) {
							duijiao = false;
							danwei = false;
						}
					}
					if (danwei && k == j) {
						if (arr[k][j] != 1)
							danwei = false;
					}
					if (shangsanjiao && k > j) {
						if (arr[k][j] != 0)
							shangsanjiao = false;
					}
					if (xiasanjiao && k < j) {
						if (arr[k][j] != 0)
							xiasanjiao = false;
					}
				}
			if (danwei)
				System.out.println("单位阵");
			else if (duijiao)
				System.out.println("对角阵");
			else if (shangsanjiao)
				System.out.println("上三角阵");
			else if (xiasanjiao)
				System.out.println("下三角阵");
			else
				System.out.println("普通矩阵");
			System.out.println();
		}

	}
}