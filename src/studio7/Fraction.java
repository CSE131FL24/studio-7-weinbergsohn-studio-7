package studio7;

public class Fraction {
	private int num;
	private int den;
	
	Fraction(int num, int den){
		this.num = num;
		this.den = den;
		simplify();
	}
	public static int getGCD(int n1, int n2) {
		int gcd = 1;
		for (int i=1; i<Math.min(n1, n2);i++) {
			if (n1%i==0 && n2%i==0) {
				gcd = i;
			}
		}
		return gcd;
	}
	private void simplify() {
		int gcd = getGCD(num,den);
		num /= gcd;
		den /= gcd;
	}
	public static Fraction add(Fraction f1, Fraction f2) {
		int den3 = f1.den * f2.den;
		int num3 = (f1.num * f2.den)+(f2.num * f1.den);
		Fraction f3 = new Fraction(num3,den3);
		f3.simplify();
		return f3;
	}
	
	public static Fraction multiply(Fraction f1, Fraction f2) {
		int den3 = f1.den * f2.den;
		int num3 = f1.num * f2.num;
		Fraction f3 = new Fraction(num3,den3);
		f3.simplify();
		return f3;
	}
	
	public static Fraction reciprocal(Fraction f1) {
		int den3 = f1.num;
		int num3 = f1.den;
		Fraction f3 = new Fraction(num3,den3);
		f3.simplify();
		return f3;
	}
	
	public static void main(String[] args) {
		Fraction fraction1 = new Fraction(5,10);
		Fraction fraction2 = new Fraction(4,5);
		System.out.println(add(fraction1,fraction2));
	}

}
