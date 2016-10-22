package compute;

public class Fraction {
	public int numerator;
	public int denominator;

	public Fraction() {
		this.numerator = 0;
		this.denominator = 1;
	}

	public Fraction(int a, int b) {
		if (b == 0) {
			System.out.print("error");
			{
				b = 1;
			}
		}
		this.numerator = a;
		this.denominator = b;
	}

	public Fraction add(Fraction a) {
		Fraction temp = new Fraction();
		temp.numerator = this.denominator * a.numerator + this.numerator * a.denominator;
		temp.denominator = this.denominator * a.denominator;
		return temp;
	}

	public Fraction sub(Fraction a) {
		Fraction temp = new Fraction();
		temp.numerator = this.numerator * a.denominator - this.denominator * a.numerator;
		temp.denominator = this.denominator * a.denominator;
		return temp;
	}

	public Fraction mul(Fraction a) {
		Fraction temp = new Fraction();
		temp.numerator = this.numerator * a.numerator;
		temp.denominator = this.denominator * a.denominator;
		return temp;
	}

	public Fraction div(Fraction a) {
		Fraction temp = new Fraction();
		temp.numerator = this.numerator * a.denominator;
		temp.denominator = this.denominator * a.numerator;
		return temp;
	}

	public void print() {
		if (this.denominator < 0){
			System.out.print((-this.numerator) + "/" + (-this.denominator));
		}
		else{
			System.out.print(this.numerator + "/" + this.denominator);			
		}
		System.out.println();
	}

	public Fraction sim() {
		Fraction temp = new Fraction(1, 1);
		int m = mutual(this.numerator, this.denominator);
		temp.numerator = this.numerator / m;
		temp.denominator = this.denominator / m;
		return temp;
	}

	private int mutual(int a, int b) {
		int temp = 0;
		if (a > b) {
			while (a % b != 0) {
				temp = a % b;
				a = b;
				b = temp;
			}
			return b;
		} else {
			return mutual(b, a);
		}
	}

	public static void main(String args[]) {
		Fraction a = new Fraction(3, 8);
		Fraction b = new Fraction(2, 3);
		System.out.println('a');
		a.print();
		System.out.println('b');
		b.print();
		System.out.println("add");
		a.add(b).print();
		a.add(b).sim().print();
		System.out.println("sub");
		a.sub(b).print();
		a.sub(b).sim().print();
		System.out.println("div");
		a.div(b).print();
		a.div(b).sim().print();
		System.out.println("mul");
		a.mul(b).print();
		a.mul(b).sim().print();
	}
}
