package week3.day1;

public class Palindrom {

	public static void main(String[] args) {
		//declare a string 
		String name="madam";
		//convert string to character array
		char[] charArray=name.toCharArray();
		//declare an empty string
		String rev="";
		//iterate the character array in reverse
		for(int i=charArray.length-1;i>=0;i--) {
			//add every character to rev string
			rev=rev+charArray[i];
		}
		//compare the declared string an reversed string
		if(name.equals(rev))System.out.println("The given string is palindrom");
		else System.out.println("The given string is not a palindrom");

	}

}
