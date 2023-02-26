package week3.day1;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		//declare an integer array
		int[] num= {1,5,6,8,9,1,3,4};
		//sort the array
		Arrays.sort(num);
		//iterate the array
		for(int i=0;i<num.length;i++) {
			//compare the array value is equal to length+1
			if(num[i]!=i+1) {
				int j=i+1;
				System.out.println(j);
				break;
			}
		}

	}

}
