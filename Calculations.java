/*
Name: Pratham Yadav
PRN: 2020BTEIT00006
Date: 18/04/2022
*/


//All the classes from the package Arithmetic
import arithmetic.Add;
import arithmetic.Sub;
import arithmetic.Mul;
import arithmetic.Div;
import arithmetic.Square_root;
import arithmetic.Square;

import java.util.*;
import java.lang.*;


class Calculations{

	public static int options(){
		
		System.out.println("Enter 1 for addition ");
		System.out.println("Enter 2 for subtraction");
		System.out.println("Enter 3 for multiplication ");
		System.out.println("Enter 4 for division");
		System.out.println("Enter 5 for square");
 		System.out.println("Enter 6 for square root");
		System.out.println("Enter 7 for Exit");
		System.out.println("Select Your Choice : ");
		Scanner s =new Scanner(System.in);
		int x = s.nextInt();
		return x;
	}

	public static void main(String arg[]){
		
		int x;
		double a=0,b=0;
		Scanner s =new Scanner(System.in);	
		
	do{	
		x=options();
		if(x<7){
			System.out.println("Enter first number : ");
			a=s.nextDouble();
		}
		
		if(x<=4){
		  	System.out.println("Enter Second number : ");
			b=s.nextDouble();
		}
		switch(x){
			case 1:

				Add c = new Add();
				double ans = c.add(a,b);
				System.out.println(a+" + "+b+" = "+ans);
				break ;

			case 2:
				Sub d = new Sub();
				double ans1 = d.sub(a,b);
				System.out.println(a+" - "+b+" = "+ans1);
				break ;

			case 3:
				Mul e = new Mul();
				double ans2 = e.product(a,b);
				System.out.println(a+" * "+b+" = "+ans2);
				break ;

			case 4:
				Div f = new Div();
				double ans3 = f.div(a,b);
				
				System.out.println(a+" / "+b+" = "+ans3);
				break ;

			case 5:
				Square g = new Square();
				double ans4 = g.sqr(a);
				System.out.println(a+" * "+a+" = "+ans4);
				break ;

			case 6:
				Square_root h = new Square_root(); 
				double ans5 = h.square_root(a);
				System.out.println("square_root(" +a+ ") = "+ans5);
				break;

			case 7:
				System.out.println("Program Ended");
				break;
			default:
				System.out.println("Enter a valid option");
				break;		
		}

	   }while(x!=7);
	}
}