package com;


import java.util.Scanner;

public class CalculatorDemo {
public static void main(String[] args)
{
	char operator;
	Double number1,number2, Result;
	Scanner input=new Scanner(System.in);
	System.out.println("Choose an Operator: +, -, *, or /");
	operator=input.next().charAt(0);
	System.out.println("Enter First number");
	number1=input.nextDouble();
	System.out.println("Enter Scond number");
	number2=input.nextDouble();
	switch(operator)
	{
	case'+':
		Result=number1+number2;
		System.out.println(number1 + " +" + number2 + "=" + Result);
		break;
	case'-':
		Result=number1-number2;
		System.out.println(number1 + " -" + number2 + "=" + Result);
		break;
	case'*':
		Result=number1*number2;
		System.out.println(number1 + " * " + number2 + "=" + Result);
		break;
	case'/':
		Result=number1/number2;
		System.out.println(number1 + " / " + number2 + "=" + Result);
		break;
		default:
			System.out.println("Invalid operator");
			break;
	}
	input.close();
}
}


