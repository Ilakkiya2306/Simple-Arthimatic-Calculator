package ArithCal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArithCal {

	public static void main(String[] args) {
		System.out.println("============[ Simple Arithmetic Calculator ] =============");
		Double num1 = (double) 0, num2 = (double) 0, res = (double) 0;
		String op = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter 1st number: ");
		try {
			num1 = Double.valueOf(sc.nextLine());
		} catch (NumberFormatException ne) {
			System.out.println("Your input has error, please correct");
			System.out.print("NumberFromatException: 1st Number - Please enter numeric only");
			num1 = Double.valueOf(sc.nextLine());
		}
		System.out.print("Please Enter 2nd number: ");
		try {
			num2 = Double.valueOf(sc.nextLine());
		} catch (NumberFormatException ne) {
			System.out.println("Your input has error, please correct");
			System.out.print("NumberFromatException: 2nd Number - Please enter numeric only");
			num2 = Double.valueOf(sc.nextLine());
		}
		System.out.print(" Please select the operation you wan to perform [+,-,*,/,&,=] :");
		op = sc.nextLine();
		DecimalFormat f = new DecimalFormat("##.00");
		switch(op) {
		case "+" : {
			res = num1+num2;
			System.out.println( num1 +op+ num2 +"="+ f.format(res));
			break;
		}
		case "-" : 
			res = num1-num2;
			System.out.println( num1 +op+ num2 +"="+ f.format(res));
			break;
		case "*" : 
			res = num1*num2;
			System.out.println( num1 +op+ num2 +"="+ f.format(res));
			break;
		case "/" :
			if(num2==0) {
				System.out.println("DivisonByZero: You can't divide by zero!!!");
				break;
			}
			res = num1/num2;
			System.out.println( num1 +op+ num2 +"="+ res);
			break;
		case "&" :
			int result = num1.intValue() & num2.intValue();
			System.out.println( num1.intValue() +op+ num2.intValue() +"="+ result);
			break;
		case "=" :
			if(num1 == num2) {
				System.out.println( num1 +"=="+ num2);
			} else if(num1 > num2) {
				System.out.println(num1 +">"+ num2);
			} else if(num1 < num2) {
				System.out.println(num1 +"<"+ num2);
			}
			break;
		default:
	        System.out.println("Invalid operator!");
	        break;		
		
		}
	}
}