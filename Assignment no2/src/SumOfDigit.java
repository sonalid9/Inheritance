
public class SumOfDigit {


		static int findSum(int number)  
		{  
		//variable that stores the sum          
		int sum;      
		//calculates sum in a single line  
		for (sum = 0; number > 0; sum = sum + number % 10, number = number / 10);  
		//returns the sum  
		return sum;  
		}  
		//driver code  
		public static void main(String args[])  
		{  
		int number = 435;  
		//calling the user-defined method and prints the result   
		System.out.println("The sum of digits: "+findSum(number));  
		}  
		  

	}


