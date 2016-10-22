package compute;

public class Complex {
	double Real, Imagin;

	public Complex() {
		this.Imagin = 0;
		this.Real = 0;
	}
	public Complex(double r, double i) {
		this.Real = r;
		this.Imagin = i;
	}

	public Complex add(Complex a) {
		return Complex.add(this, a);
	}
	
	public static Complex add(Complex a, Complex b) {
		Complex temp = new Complex();
		temp.Real = b.Real + a.Real;
		temp.Imagin = b.Imagin + a.Imagin;
		return temp;
	}

	public Complex sub(Complex a) {
		return Complex.sub(this, a);
	}
	public static Complex sub(Complex b, Complex a) {
		Complex temp = new Complex();
		temp.Real = b.Real - a.Real;
		temp.Imagin = b.Imagin - a.Imagin;
		return temp;
	}
	
	public Complex mul(Complex a) {
		return Complex.mul(this, a);
	}

	public static Complex mul(Complex a, Complex b) {
		Complex temp = new Complex();
		temp.Real = b.Real * a.Real - b.Imagin * a.Imagin;
		temp.Imagin = b.Real * a.Imagin + b.Imagin * a.Real;
		return temp;
	}
	
	public Complex div(Complex a) {
		return Complex.div(this, a);
	}

	public static Complex div(Complex b, Complex a) {
		Complex temp = new Complex();
		double base = (a.Imagin * a.Imagin + a.Real * a.Real);
		temp.Real = (b.Real * a.Real + b.Imagin * a.Imagin)
				/ base;
		temp.Imagin = (b.Real * a.Imagin - b.Imagin * a.Real)
				/ base;

		return temp;
	}

	public double abs() {
		return Math.sqrt(this.Real * this.Real + this.Imagin * this.Imagin);
	}

	public void print() {
		if (this.Imagin > 0) {
			System.out.println(this.Real + "+" + this.Imagin+'i');
		}
		else if (this.Imagin < 0){
			System.out.println(this.Real + this.Imagin+'i');
		}
		else{
			System.out.println(this.Real);
		}
	}
	
	public static void main(String args[]) {
		Complex a = new Complex(2,1);
		Complex b = new Complex(1,2);
		System.out.print("a: ");
		a.print();
		System.out.print("b: ");
		b.print();
		
		System.out.println("add");
		Complex.add(a, b).print();
		a.add(b).print();

		System.out.println("sub");
		a.sub(b).print();
		Complex.sub(a, b).print();
		
		System.out.println("mul");
		a.mul(b).print();
		Complex.mul(a, b).print();
		
		System.out.println("div");
		a.div(b).print();
		Complex.div(a, b).print();
		
		System.out.println("abs");
		System.out.print(a.abs());
	}
}