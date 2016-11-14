import java.util.Scanner;
import java.lang.Math.*;

public class ComplexNumber {
	static Scanner sc = new Scanner(System.in);
	
	private double real;
	private double img;
	private double mag;
	private double theta;
	public ComplexNumber(){}
	
	public ComplexNumber(double rl, double im){
		real = rl;
		img = im;
		mag = Math.sqrt(real*real + img*img);
		theta = Math.toDegrees(Math.atan(img/real));
	}
	// Addition
	public ComplexNumber add(ComplexNumber Z){
		ComplexNumber R = new ComplexNumber(real + Z.real, img + Z.img);
		return R;
	}
	// Subtraction
	public ComplexNumber sub(ComplexNumber Z){
		ComplexNumber R = new ComplexNumber(real - Z.real, img - Z.img);
		return R;
	}
	/**
	public double magnitude(){
		return Math.sqrt(real*real + img*img);
	}
	public double argument(){
		return Math.toDegrees(Math.atan(img/real));
	}
	*/
	
	public void printComplexNumber(){
		prl(real + " + " + img + " i ");
		prl("Magnitude : " + mag + " && Arguments: " + theta);
	}
	
	/**
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prl("Hello World");
		
		ComplexNumber c1 = new ComplexNumber(12.0,10.5);
		ComplexNumber c2 = new ComplexNumber(15.5,10.5);
		ComplexNumber c3 = new ComplexNumber(12.0,20.5);
		c1.printComplexNumber();
		c2.printComplexNumber();
		c3.printComplexNumber();
		//prl(c1.magnitude()+ " " + c1.argument());
		ComplexNumber R1 = c1.add(c2);
		ComplexNumber R2 = R1.sub(c1);
		
		R1.printComplexNumber();
		R2.printComplexNumber();
		c2.printComplexNumber();

	}
	*/
	
	static void prl(Object anyObject) {
		System.out.println(anyObject);
	}

}
