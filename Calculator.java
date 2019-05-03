import java.util.Scanner;

public class Calculator 
{
	public static double num1;
	public static double num2;
	
	public static void addition(double num1 , double num2)
	{
		double result = num1 + num2 ;
		System.out.println("Result on addition is:"+result);
	}
	public static void subtraction(double num1 , double num2)
	{
		double result = num1 - num2 ;
		System.out.println("Result on addition is:"+result);
	}
	public static void multiplication(double num1 , double num2)
	{
		double result = num1 * num2 ;
		System.out.println("Result on addition is:"+result);
	}
	public static void division(double num1 , double num2)
	{
		try 
		{
			double result = num1 / num2 ;
			System.out.println("Result on division is:"+result);
		}
		catch (Exception e) 
		{
			System.err.println(e.getMessage());
		}
	finally
	{
		System.err.println("The divisor can't be zero");
	}
	}
	
	public static void main(String[]args)
	{
		System.out.println("What operation to be performed?(Select in between 1-4)");
		System.out.println("1.addition"+"\n"+"2.subtraction"+"\n"+"3.multiplication"+"\n"+"4.division"+"\n");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter the first number:");
		double num1 = sc.nextDouble();
		System.out.println("First number is: "+num1);
		System.out.println("Enter the second number:");
		double num2 = sc.nextDouble();
		System.out.println("Second number is: "+num2);
		
		switch(x)
		{
		case 1:
			System.out.println("Addition");
		addition(num1 , num2);
		break;
		
		case 2:
			System.out.println("Subtraction");
		subtraction(num1 , num2);
		break;
		
		case 3:
			System.out.println("Multiplication");
		multiplication(num1 , num2);
		break;
		
		case 4:
			System.out.println("Division");
		division(num1 , num2);
		break;
		
		 default:
			System.out.println("Invalid input");
		break;
		}
	}
	
}
