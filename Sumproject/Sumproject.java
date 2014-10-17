


/*Elohe Yonas CSC200 
 * date: 9/24/2014
 * purpose: to create a program that gives the sum and average of 5 numbers you type

 * create variables for the 5 numbers
 * use keyboard scanner
 * give functions to the variable
 * prompt user for 5 numbers;
 * read variables for the 5 numbers
 * read sum as adding all 5 typed integers
 * printout sum 
 * read average as dividing sum by 5
 * printout average
 * 
 * 
 * 
 */
import java.util.Scanner;

public class Sumproject {

public static void main(String[]args)
		{
	int num1, num2, num3, num4, num5, sum, average;
	
	Scanner keyboard = new Scanner(System.in);
	
	
	
	System.out.println ("type 5 numbers");
	num1= keyboard.nextInt();
	num2= keyboard.nextInt();
	num3= keyboard.nextInt();
	num4= keyboard.nextInt();
	num5= keyboard.nextInt();
	
	sum = num1 + num2 + num3 + num4 + num5;
	
	System.out.println ("the sum is" + sum);
	
	average = sum/5;
	System.out.println ("the average is" + average);

}
}