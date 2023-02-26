package week3.day1;
import java.util.*;
public class ReverseAString {

	public static void main(String[] args) {
		//declare a object for scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input");
		//get input from user and store in a variable
		String nextLine=scan.nextLine();
		//convert string to character array
		char[] charArray=nextLine.toCharArray();
		//iterate the character array in reverse
		for (int i=charArray.length-1;i>=0;i--)
			//print the character array
			System.out.print(charArray[i]);
		}

	}


