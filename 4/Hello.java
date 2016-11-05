import java.util.Random;

public class Hello {
	public static void main(String args[]) {

		Thread1 t1 = new Thread1(100, 10000, "1");
		Thread2 t2 = new Thread2(20000, 30000, "2");
		t1.start();
		t2.start();
	}

	static class Thread1 extends Thread {
		int max = 100;
		int min = 10000;
		String threadname;
		Thread1(int themin, int themax, String name){
			max = themax;
			min = themin;
			threadname = name;
		}

		double sum = 0;
		Random random = new Random();
		public void run() {
			for (int i = 0; i < 10000; i++) {
				int tmp = random.nextInt(max) % (max - min + 1) + min;
				sum += tmp;
				System.out.println(tmp+" ");
			}
			System.out.println("thread"+ threadname + " sum" + sum);
		}
	}
	static class Thread2 extends Thread {
		int max = 100;
		int min = 10000;
		String threadname;
		Thread2(int themin, int themax, String name){
			max = themax;
			min = themin;
			threadname = name;
		}

		double sum = 0;
		Random random = new Random();
		public void run() {
			for (int i = 0; i < 10000; i++) {
				int tmp = random.nextInt(max) % (max - min + 1) + min;
				sum += tmp;
				System.out.println(tmp+" ");
			}
			System.out.println("thread"+ threadname + " sum" + sum);
		}
	}
}
