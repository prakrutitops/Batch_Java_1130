package oop;

public class B42
{
	double real;
	double imag;
	
	public B42(double a, double b) 
	{
		this.real = a;
		this.imag = b;
	}
	
	public static void main(String[] args) 
	{
		B42 b42 = new B42(4.6, 8.10),
			b43 = new B42(6.8, 10.00),
		temp;
		
		temp = add(b42,b43);
		System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
	}
	public static B42 add(B42 b42, B42 b43)
	{
		B42 temp = new B42(0, 0);
		temp.real = b42.real + b43.real;
		temp.imag = b42.imag + b43.imag;
		return (temp);
	}
}
