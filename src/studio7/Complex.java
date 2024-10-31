package studio7;

public class Complex {
	private double real;
	private double imag;
	
	Complex(double real, double imag){
		this.real = real;
		this.imag = imag;
	}
	
	public static Complex add(Complex num1, Complex num2) {
		double real = num1.real + num2.real;
		double imag = num1.imag + num2.imag;
		Complex num3 = new Complex(real, imag);
		return num3;
	}
	public static Complex multiply(Complex num1, Complex num2) {
		double real = (num1.real * num2.real) - (num1.imag * num2.imag);
		double imag = (num1.real * num2.imag) - (num1.imag * num2.real);
		Complex num3 = new Complex(real,imag);
		return num3;
	}
	public static void main(String[] args) {
		Complex num1 = new Complex(4.0,1.5);
		Complex num2 = new Complex(4.3,6.7);
		add(num1,num2);
		multiply(num1,num2);
	}

}
