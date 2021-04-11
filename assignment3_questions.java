package assignment3;

public class assignment3_questions {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("question 1 =======================");
		
		/*Question-1

		Write a program to convert gallons into Litres and display it.

		        Sample output:

		       15 gallon is 56.7812 litre  */
		
		
		
		final double litres=3.785413333333333;
		int gallon=15;
		
		System.out.println(gallon +" gallon is " + (gallon*litres)+" litre");
		
		System.out.println();
		System.out.println("question 2 =======================");
		
		/*Question-2

		Write a program - > Declare variables for your name and birth year,
		 and the program will display:

		      " Hello, Ozzy! Based on your input, your age is 15 :) "*/
		
		String  name ="mohammed";
		int birthyear=1996;
		
		int currentyear=2021;
		
		int age =currentyear-birthyear;
	
		System.out.println("hello,"+name+" your age is "+age);
		
		System.out.println();
		System.out.println("question 3 =======================");
		/*Question-3

		Write a Java program that displays the area of a 
		rectangle with a width of 4.5 and a height of 
		7.9 using the following formula:

		area = width * height			*/
		
		double area,height,width =4.5;
		 height =7.9;
		 area=width*height;
		System.out.println("your area is = "+area);
		
		System.out.println();
		System.out.println("question 4 =======================");
		/*Question-4

		Declare 2 variables (Num1, Num2)

		Swap values between Num1 and Num2

		Display new values of Num1 and Num2

		      Sample output:

		      n1=10
		      n2=20

		      ----------

		      n1=20
		      n2=10				*/

		int num1=10;
		int num2=20;
		
		if (num1<num2) {
			num1=10;
			num2=20;
			System.out.println("n1="+num1);
			System.out.println("n2="+num2);
			System.out.println("-----------");
			
		}
		if (num1<num2) {
			num1=20;
			num2=10;
			System.out.println("n1="+num1);
			System.out.println("n2="+num2);
			
		
			
		}
		/*Question-5

Write a program that outputs the number of hours, minutes, and seconds that
 corresponds to input total seconds.

-Declare int variables inputSeconds, hours, minutes, seconds
-Initialize the inputSeconds

-Using %(remainder) and / operators, find out how many whole hours, minutes
 and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result

       Sample Output:

       inputSecond is 3695

      1 hours, 1 minutes, and 35 seconds      */
		
		

	
	
	
	
	System.out.println("question 6----------------------");
	
		//1 gram ==1000 milligrams

		double 		numberOfMilligrams = 500;

		double 		gram = numberOfMilligrams / 1000;

		int	 countDrinks = (int) (10 / gram);

		System.		out.println("it would take about " + countDrinks + " drinks for a lethal overdose");
	
	
	System.out.println("question 7----------------------------");
	
	
		int priceInCents = 95;

		int change = 100 - priceInCents; 

		int quarter = change / 25; 

		int dimes = (change % 25)/10; 

		int nickles = ((change % 25) % 10)/5;

		System.out.println("Your change is " + quarter + " quarters, " + dimes + " dimes, and " + nickles + " nickles");

	
	}
	
	
}
